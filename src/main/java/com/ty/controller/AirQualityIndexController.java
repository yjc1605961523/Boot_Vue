package com.ty.controller;


import com.github.pagehelper.PageInfo;
import com.ty.entity.AirQualityIndex;
import com.ty.service.IAirQualityIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}

