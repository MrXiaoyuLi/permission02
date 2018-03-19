package org.supermarket.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CommonDao<T,PK extends Serializable> {
	public void add(T entity);
	
	public void deleteById(PK id);
	
	public void batchDelete(PK[] ids);
	
	public T getById(PK id);
	
	public void update(T entity);
	
	public List<T> getAll();
	/**
	 * 查询总数据条数
	 * @return
	 */
	public Integer getCount();
	/**
	 * 分页检索数据
	 * @param start 起始位置
	 * @param pageSize 每页的数据条数
	 * @return
	 */
	public List<T> getList(@Param("start")int start,@Param("pageSize") int pageSize);
	
	/**
	 * 按条件分页检索数据
	 * @param start 起始位置
	 * @param pageSize 每页显示的数据条数
	 * @param condtion 查询条件
	 * @return
	 */
	public List<T> getByCondition(@Param("start")int start,@Param("pageSize") int pageSize,@Param("condition") T condition,@Param("columnName") String columnName,@Param("orderBy") String orderBy);
	
	public Integer getCountByCondition(@Param("condition") T condition);
}









