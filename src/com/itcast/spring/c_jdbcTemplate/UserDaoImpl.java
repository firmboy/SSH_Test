package com.itcast.spring.c_jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		ComboPooledDataSource da = new ComboPooledDataSource();
	}
	
	/**
	 * 增
	 */
	public void save(){
		jdbcTemplate.update("insert into user values(null,?,?)", "小泽",30);
	}
	
	/**
	 * 删
	 */
	public void delete(){
		jdbcTemplate.update(" DELETE FROM USER WHERE id = ?",2);
	}
	/**
	 * 改
	 */
	public void update(){
		jdbcTemplate.update("update user set name=? where id = ?","小苍",5);
	}
	/**
	 * 查queryforlist是只能查询某一列的数据，并且封装成list集合，返回
	 */
	public void query1(){
		List<Integer> queryForList = jdbcTemplate.queryForList("select id from user ",Integer.class);
		System.out.println(queryForList);
	}
	
	/**
	 * 查
	 */
	public void query(){
		List<User> query = jdbcTemplate.query("select * from user", new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setMoney(rs.getDouble(3));
				return user;
			}
			
		});
		System.out.println(query);
		
	}

	
}
