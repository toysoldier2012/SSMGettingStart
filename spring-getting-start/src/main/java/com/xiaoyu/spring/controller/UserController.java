package com.xiaoyu.spring.controller;

import com.xiaoyu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void saveUser(){
		userService.saveUser();
	}
	public void test(){
		System.out.println("test UserController....");
	}
}
