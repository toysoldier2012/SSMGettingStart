package com.xiaoyu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestDataSource {
	@Test
	public void testDataSource(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-data-source.xml");
		DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);
		try {
			System.out.println(bean.getConnection());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
