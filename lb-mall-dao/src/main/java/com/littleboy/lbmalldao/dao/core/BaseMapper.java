package com.littleboy.lbmalldao.dao.core;


import com.littleboy.lbmalldao.dao.core.plugins.page.Page;
import com.littleboy.lbmalldao.dao.model.TBContentCategory;
import com.littleboy.lbmalldao.dao.model.TBContentCategoryExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 
 * @author littleboy
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
	 * 插入对象  对象可以有空值
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
	 *通过example删除
	 * @param example
	 *			查询封装器
	 */
	int deleteByExample(Example example);

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



	/**
	 * 通过对象插入
	 * @param record
	 * 			数据对象
	 * */
	int insert(Entity record);

	/**
	 * 通过examples更新
	 * @param record
	 * 			数据对象
	 * @param example
	 * 			查询封装器
	 * */
	int updateByExample(@Param("record") TBContentCategory record, @Param("example") TBContentCategoryExample example);


	/**
	 * 通过key更新
	 * @param record
	 * 			数据对象
	 * */
	int updateByPrimaryKey(TBContentCategory record);

}
