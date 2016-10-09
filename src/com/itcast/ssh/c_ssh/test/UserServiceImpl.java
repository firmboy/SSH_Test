package com.itcast.ssh.c_ssh.test;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImpl implements UserService {

	
	private UserDao dao;
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void save(User user) {
		System.out.println("service层的save方法执行了");
		dao.save(user);
	}

}
