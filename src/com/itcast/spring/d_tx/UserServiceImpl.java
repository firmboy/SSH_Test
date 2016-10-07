package com.itcast.spring.d_tx;

public class UserServiceImpl implements UserService {

	private UserDaoImpl dao;
	public void setDao(UserDaoImpl dao) {
		this.dao = dao;
	}

	public void save() {
		System.out.println("service层save方法执行：。。。。。");
		dao.save();
	}
	
}
