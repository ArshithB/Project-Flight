package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.UserDao;
import com.flight.dto.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User createUser(User newUser) {
		return userDao.save(newUser);
	}

	@Override
	public User updateUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(long UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> displayAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(long UserId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
