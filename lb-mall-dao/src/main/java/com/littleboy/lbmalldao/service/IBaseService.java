package com.littleboy.lbmalldao.service;

import com.littleboy.lbmalldao.dao.core.plugins.page.Page;

import java.util.List;

public interface IBaseService<Entity,PrivateKey,Example> {
    Long getCount(Example example);
    Entity addDataByModel(Entity entity);
    int updateByPrimaryKeyAndModel(Entity entity);
    int updateByExampleAndModel(Entity entity,Example example);
    int deleteByPrimaryKey(PrivateKey privateKey);
    Entity getDataByPrimaryKey(PrivateKey privateKey);
    Page<Entity> getDataByExample(Example example, int pageNo, int pageSize);
    List<Entity> getDataByExample(Example example);

}
