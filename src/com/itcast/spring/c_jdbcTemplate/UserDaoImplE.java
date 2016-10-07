package com.itcast.spring.c_jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImplE extends JdbcDaoSupport implements UserDao{
	
	/**
	 * 增
	 */
	public void save(){
		this.getJdbcTemplate().update("insert into user values(null,?,?)", "小泽",30);
	}
	
	/**
	 * 删
	 */
	public void delete(){
		this.getJdbcTemplate().update(" DELETE FROM USER WHERE id = ?",2);
	}
	/**
	 * 改
	 */
	public void update(){
		this.getJdbcTemplate().update("update user set name=? where id = ?","小苍",5);
	}
	/**
	 * 查queryforlist是只能查询某一列的数据，并且封装成list集合，返回
	 */
	public void query1(){
		List<Integer> queryForList = this.getJdbcTemplate().queryForList("select id from user ",Integer.class);
		System.out.println(queryForList);
	}
	
	/**
	 * 查
	 */
	public void query(){
		List<User> query = this.getJdbcTemplate().query("select * from user", new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setAge(rs.getInt(3));
				return user;
			}
			
		});
		System.out.println(query);
		
	}
}
