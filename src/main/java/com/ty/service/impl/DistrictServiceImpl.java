package com.ty.service.impl;

import com.ty.dao.DistrictMapper;
import com.ty.entity.District;
import com.ty.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Service
public class DistrictServiceImpl  implements IDistrictService {
    @Autowired
   private DistrictMapper districtMapper;
    @Override
    public List<District> getAll() {
        return districtMapper.getAll();
    }
}
