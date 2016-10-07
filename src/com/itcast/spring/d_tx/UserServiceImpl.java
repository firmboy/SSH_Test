package com.itcast.spring.d_tx;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void pay(){
		
		
		
	}

	public void save(User user) {
		dao.save(user);
		
	}
	
}
