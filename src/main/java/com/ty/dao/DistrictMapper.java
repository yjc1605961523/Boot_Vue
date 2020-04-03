package com.ty.dao;

import com.ty.entity.District;
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
public interface DistrictMapper {
   //获取所有下拉框的值
    List<District> getAll();
}
