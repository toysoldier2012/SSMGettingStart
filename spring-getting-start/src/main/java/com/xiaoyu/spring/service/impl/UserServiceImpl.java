package com.xiaoyu.spring.service.impl;

import com.xiaoyu.spring.dao.UserDao;
import com.xiaoyu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser() {
		userDao.saveUser();
	}

	public void test(){
		System.out.println("test UserServiceImpl....");
	}
}
