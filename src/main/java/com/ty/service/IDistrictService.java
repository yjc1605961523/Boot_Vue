package com.ty.service;

import com.ty.entity.District;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
@Service
public interface IDistrictService {
    List<District> getAll();
}
