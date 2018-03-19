package org.supermarket.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.supermarket.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:supermarket-service.xml","classpath:supermarket-dao.xml"})
public class TestuserService {
	@Resource
	private UserService userService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Test
	public void test() {
		List<User> list = userService.getList(0, 5, null, "id", "asc");
		for (User user : list) {
			System.out.println(user);
		}
	}

}
