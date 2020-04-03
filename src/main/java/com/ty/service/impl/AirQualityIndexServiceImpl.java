package com.ty.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ty.dao.AirQualityIndexMapper;
import com.ty.entity.AirQualityIndex;
import com.ty.service.IAirQualityIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Service
public class AirQualityIndexServiceImpl  implements IAirQualityIndexService {

    @Autowired
    private AirQualityIndexMapper airQualityIndexMapper;
    @Override
    public PageInfo<AirQualityIndex> getPageAir(Integer districtId, Integer currentPageNo, Integer pageSize) {
        Page<AirQualityIndex> objects = PageHelper.startPage(currentPageNo, pageSize);
        airQualityIndexMapper.getPageAir(districtId);
        return objects.toPageInfo();
    }
}
