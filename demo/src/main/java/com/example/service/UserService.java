package com.example.service;

import com.example.entity.User;

public interface UserService {
	public void save(User user);

	public User getUser(Integer id);
}
