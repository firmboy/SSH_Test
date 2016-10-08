package com.itcast.ssh.b_spring_hibernate.test;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao dao;

	public void save(User user) {
		System.out.println("service层的save方法执行了");
		dao.save(user);
	}

}
