package com.itcast.spring.c_jdbcTemplate;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void save() {
		System.out.println("service层save方法执行：。。。。。");
		//dao.save();
		//dao.delete();
		//dao.update();
		dao.query();
	}
	
}
