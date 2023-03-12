package com.xiaoyu.spring.service;

import org.springframework.stereotype.Service;

public interface UserService {
	void saveUser();
	default void test(){
		System.out.println("test UserService....");
	}
}
