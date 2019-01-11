package com.mapper;

import com.entity.MateDict;

public interface MateDictMapper {
    int deleteByPrimaryKey(Integer mateId);

    int insert(MateDict record);

    int insertSelective(MateDict record);

    MateDict selectByPrimaryKey(Integer mateId);

    int updateByPrimaryKeySelective(MateDict record);

    int updateByPrimaryKey(MateDict record);
}