package com.littleboy.lbmalldao.service.impl;

import com.littleboy.lbmalldao.dao.core.BaseMapper;
import com.littleboy.lbmalldao.dao.core.plugins.page.Page;
import com.littleboy.lbmalldao.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BaseServiceImpl<Entity,PrimaryKey,Example> implements IBaseService<Entity,PrimaryKey,Example> {

    @Autowired
    BaseMapper<Entity,PrimaryKey,Example> baseMapper;
    @Override
    public Long getCount(Example example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public Entity addDataByModel(Entity entity) {
        baseMapper.insertSelective(entity);
        return entity;
    }

    @Override
    public int updateByPrimaryKeyAndModel(Entity entity) {
        return baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int updateByExampleAndModel(Entity entity, Example example) {
        return baseMapper.updateByExampleSelective(entity,example);
    }

    @Override
    public int deleteByPrimaryKey(PrimaryKey primaryKey) {
        return baseMapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public Entity getDataByPrimaryKey(PrimaryKey primaryKey) {
        return baseMapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public Page<Entity> getDataByExample(Example example, int pageNo, int pageSize) {
        Page<Entity> page = new Page<>(pageNo,pageSize);
        page.setResult(baseMapper.selectByExample(example,page));
        return page;
    }

    @Override
    public List<Entity> getDataByExample(Example example) {
        return baseMapper.selectByExample(example);
    }
}
