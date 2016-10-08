package com.itcast.ssh.b_spring_hibernate.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value=SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value="applicationContext.xml")
@ContextConfiguration(value="classpath:com/itcast/ssh/b_spring_hibernate/test/applicationContext.xml")
public class TestDemo {
	
	@Resource(name="userService")
	private UserService service;

	
	@Test
	public void test1(){
		User user = new User();
		user.setName("小泽");
		service.save(user);
	}
}
