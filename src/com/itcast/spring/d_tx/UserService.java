package com.itcast.spring.d_tx;

public interface UserService {
	public void save(User user);
	public void pay(User out,User in,double money);
}
