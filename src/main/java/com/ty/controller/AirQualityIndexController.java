package com.ty.controller;


import com.github.pagehelper.PageInfo;
import com.ty.entity.AirQualityIndex;
import com.ty.service.IAirQualityIndexService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Controller
@RequestMapping("/airQualityIndex")
public class AirQualityIndexController {
    @Autowired
    private IAirQualityIndexService airQualityIndexService;
    @RequestMapping("/getPageAir")
    @ResponseBody
    public Object getPageAir(Integer districtId,Integer pageIndex){
        System.out.println(districtId+"------------"+pageIndex);
        if (pageIndex==null){
            pageIndex=0;
        }
        PageInfo<AirQualityIndex> pageAir = airQualityIndexService.getPageAir(districtId, pageIndex+1, 5);
        System.out.println(pageAir.toString());
        return pageAir;
    }
    @RequestMapping("/POI")
    @ResponseBody
    public void POI(HttpServletResponse response){

        PageInfo<AirQualityIndex> pageAir = airQualityIndexService.getPageAir(null , 1, 10);
        Iterator<AirQualityIndex> iterator = pageAir.getList().iterator();

        //创建工作簿
        HSSFWorkbook hssfWorkbook=new HSSFWorkbook();
        //创建表,参数是表的名称
        HSSFSheet airTable = hssfWorkbook.createSheet("空气检测表");
        //创建一行,代表行数
        HSSFRow row = airTable.createRow(0);
        //准备表头的数据
        String [] headers={"序号","区域","监测时间","PM10数据","PM2.5数据", "监测站"};
        //设置表头
        HSSFCell cell = null;
        for (int i=0; i<headers.length; i++){
            cell = row.createCell(i);
            cell.setCellValue(headers[i]);
            //后面测参数是设置表格的宽度
            airTable.setColumnWidth(i,4000);
        }
        //设置表体,从第二行开始
        int n=1;
        while (iterator.hasNext()) {
            AirQualityIndex next = iterator.next();
            //创建第n行
            row=airTable.createRow(n);
            row.createCell(0).setCellValue(next.getId());
            row.createCell(1).setCellValue(next.getDistrict().getName());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            row.createCell(2).setCellValue(sdf.format(next.getLastModifyTime()));
            row.createCell(3).setCellValue(next.getPm10());
            row.createCell(4).setCellValue(next.getPm25());
            row.createCell(5).setCellValue(next.getMonitoringStation());
            //行数++
            n++;

        }
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            hssfWorkbook.write(outputStream);
            outputStream.flush();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

