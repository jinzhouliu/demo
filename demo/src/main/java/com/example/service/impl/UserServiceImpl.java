package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Autowired
	UserRepository repository;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public User getUser(Integer id) {
		// 有两种方式：
		// 1.调用crudRepository的接口
//        return repository.findOne(id);
		// 2.调用我们自己写的接口
		return repository.getUser(id);
	}

}
