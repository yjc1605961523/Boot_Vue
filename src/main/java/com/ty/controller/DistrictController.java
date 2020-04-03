package com.ty.controller;


import com.ty.entity.District;
import com.ty.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Controller
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @RequestMapping("/bind")
    @ResponseBody
    public Object bind(){
        System.out.println("------------------"+districtService);
        List<District> all = districtService.getAll();
        System.out.println(all.toString());
        return all;
    }
}

