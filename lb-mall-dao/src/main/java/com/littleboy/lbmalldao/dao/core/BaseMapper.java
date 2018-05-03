package com.littleboy.lbmalldao.dao.core;


import com.littleboy.lbmalldao.dao.core.plugins.page.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author lwp
 * 
 * @param <Model>
 * @param <PK>
 */
public interface BaseMapper<Entity,PK, Example> {

	/**
	 * 数量
	 * @param example
	 * @return
	 */
	long countByExample(Example example);
	
	/**
	 * 插入对象
	 * 
	 * @param model
	 *            对象
	 */
	int insertSelective(Entity entity);

	/**
	 * 更新对象
	 * 
	 * @param model
	 *            对象
	 */
	int updateByPrimaryKeySelective(Entity entity);
	
	/**
	 * 更新对象
	 * @param record
	 * @param example
	 * @return
	 */
	int updateByExampleSelective(@Param("record") Entity record, @Param("example") Example example);

	/**
	 * 通过主键, 删除对象
	 * 
	 * @param id
	 *            主键
	 */
	int deleteByPrimaryKey(PK id);

	/**
	 * 通过主键, 查询对象
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	Entity selectByPrimaryKey(PK id);

	/**
	 * 
	 * @param example
	 *            查询封装器
	 * @param page
	 *            分页
	 * @return
	 */
	public List<Entity> selectByExample(Example example, Page<Entity> page);
	
	/**
	 * 查询封装器
	 * @param example
	 * @return
	 */
	public List<Entity> selectByExample(Example example);

}
