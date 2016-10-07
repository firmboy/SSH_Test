package com.itcast.spring.d_tx;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:com/itcast/spring/d_tx/applicationContext.xml")
public class TestDemo {
	
	@Resource(name="userService")
	private UserService service;
	
	@Test
	public void test1(){
		try {
			User user = new User();
			user.setName("小泽");
			user.setMoney(10000);
			service.save(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		try {
			User out = new User();
			out.setId(1);
			User in = new User();
			in.setId(2);
			service.pay(out, in, 1000);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
