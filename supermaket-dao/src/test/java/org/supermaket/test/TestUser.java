package org.supermaket.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.supermarket.dao.UserDao;
import org.supermarket.pojo.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:supermarket-dao.xml")
public class TestUser {
	
	@Resource
	private UserDao userDao;
	
	public void setUserdao(UserDao userdao) {
		this.userDao = userdao;
	}
	@Test
	public void test() {
		List<User> list = userDao.getByCondition(0, 5, null, "id", "asc");
		for (User user : list) {
			System.out.println(user.getUserName());
		}
	}

}
