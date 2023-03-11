package com.xiaoyu.spring.test;

import com.xiaoyu.spring.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {

	@Test
	public void test(){
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring) ioc.getBean("helloSpring");
		helloSpring.testHelloSpring();
	}
}
