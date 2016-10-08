package com.itcast.ssh.b_spring_hibernate.way1;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly=false)
@Transactional
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao dao;

	public void save(User user) {
		System.out.println("service层的save方法执行了");
		dao.save(user);
	}

}
