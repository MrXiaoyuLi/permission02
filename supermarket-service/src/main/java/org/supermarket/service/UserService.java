package org.supermarket.service;

import java.util.List;

import org.supermarket.pojo.User;

public interface UserService {
	
	public List<User> getList(int start,int size,User condition,String column,String orderBy);
	
	public int getcount(User condition);
}
