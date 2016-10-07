package com.itcast.spring.d_tx;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
	public void save(){
		System.out.println("dao层save方法执行了...");
	}
	
	/**
	 * 用户账户的钱减少
	 */
	@Override
	public void outMoney(User user, double money) {
		this.getJdbcTemplate().update("update user set money = money -? where id = ?", money,user.getId());
		
	}
	
	/**
	 * 用户账户的钱增加
	 */
	@Override
	public void inMoney(User user, double money) {
		this.getJdbcTemplate().update("update user set money = money +? where id = ?", money,user.getId());
		
		
	}

	public void save(User user) {
		this.getJdbcTemplate().update("insert into user values(null,?,?)", user.getName(),user.getMoney());
		
	}
}
