package com.itcast.spring.c_jdbcTemplate;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	@Test
	public void test1() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/itcast/spring/c_jdbcTemplate/applicationContext.xml");
			UserService service = (UserService) context.getBean("userService");
			service.save();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
