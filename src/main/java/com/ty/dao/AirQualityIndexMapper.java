package com.ty.dao;

import com.ty.entity.AirQualityIndex;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Repository
public interface AirQualityIndexMapper  {
    List<AirQualityIndex> getPageAir(@Param("districtId") Integer districtId);
}
