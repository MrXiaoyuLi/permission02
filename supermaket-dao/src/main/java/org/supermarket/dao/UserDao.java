package org.supermarket.dao;

import org.apache.ibatis.annotations.Param;
import org.supermarket.pojo.User;

public interface UserDao extends CommonDao<User, Integer>{
	/**
	 * 根据用户名查询用户信息
	 * @param username1
	 * @return
	 */
	public User getByUsername(@Param("username") String username);
}
