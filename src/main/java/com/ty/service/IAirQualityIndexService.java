package com.ty.service;

import com.github.pagehelper.PageInfo;
import com.ty.entity.AirQualityIndex;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Service
public interface IAirQualityIndexService  {

    PageInfo<AirQualityIndex> getPageAir(Integer districtId, Integer currentPageNo, Integer pageSize);
}
