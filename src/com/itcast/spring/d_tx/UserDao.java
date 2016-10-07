package com.itcast.spring.d_tx;

public interface UserDao {
	public void save();
	public void outMoney(User user,double money);
	public void inMoney(User user,double moner);
	public void save(User user);
}
