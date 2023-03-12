package com.xiaoyu.spring.test;

import com.xiaoyu.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutoWire {
	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
		UserController bean = applicationContext.getBean(UserController.class);
		bean.saveUser();
	}
}
