package com.xiaoyu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcess implements InitializingBean, DisposableBean {
	private int id;

	public BeanProcess() {
		System.out.println("init....");
	}

	public void setId(int id) {
		System.out.println("set id....");
		this.id = id;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set...");
	}

	public void initMethod(){
		System.out.println("init method....");
	}

	public void test(){
		System.out.println("test....");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy....");
	}

	public void destroyMethod(){
		System.out.println("destroy method....");
	}
}
