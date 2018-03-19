package org.supermarket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.supermarket.dao.UserDao;
import org.supermarket.pojo.User;
import org.supermarket.service.UserService;

@Service("userService")
public class UserServiceimpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getList(int start, int pageSize, User condition, String columnName, String orderBy) {
		return userDao.getByCondition(start, pageSize, condition, columnName, orderBy);
	}

	public int getcount(User condition) {
		return userDao.getCountByCondition(condition);
	}
	
}
