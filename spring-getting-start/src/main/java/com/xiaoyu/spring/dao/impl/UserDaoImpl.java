package com.xiaoyu.spring.dao.impl;

import com.xiaoyu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser() {
		System.out.println("saved....");
	}

	public void test(){
		System.out.println("test....");
	}
}
