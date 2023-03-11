package com.xiaoyu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After init | beanName = " + beanName + ", bean = " + bean);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before init | beanName = " + beanName + ", bean = " + bean);

		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
