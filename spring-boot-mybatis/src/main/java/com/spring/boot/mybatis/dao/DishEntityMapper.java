package com.spring.boot.mybatis.dao;

import com.spring.boot.mybatis.po.DishEntity;

public interface DishEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DishEntity record);

    int insertSelective(DishEntity record);

    DishEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DishEntity record);

    int updateByPrimaryKey(DishEntity record);
}