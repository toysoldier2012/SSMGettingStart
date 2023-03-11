package com.xiaoyu.spring.test;

import com.xiaoyu.spring.BeanProcess;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanProcess {

	@Test
	public void testBeanProcess() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-process-context.xml");
		BeanProcess bean = applicationContext.getBean(BeanProcess.class);
		bean.test();
		applicationContext.registerShutdownHook();
	}
}
