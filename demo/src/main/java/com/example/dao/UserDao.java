package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(User user) {
		String sql = "insert into t_user(user_name, password) values(?,?)";
		jdbcTemplate.update(sql, user.getUserName(), user.getPassword());
	}
}
