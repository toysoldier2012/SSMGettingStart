package com.xiaoyu.spring.test;

import com.xiaoyu.spring.pojo.Actor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestActor {
	@Test
	public void test(){
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Actor actor = (Actor) classPathXmlApplicationContext.getBean("actorB");
		actor.test();
		System.out.println(actor);
	}
}
