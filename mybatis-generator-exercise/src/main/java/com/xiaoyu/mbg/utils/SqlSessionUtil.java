package com.xiaoyu.mbg.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
	private static SqlSession sqlSession = null;

	public static SqlSession getSqlSession() {
		InputStream resourceAsStream = null;
		try {
			resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
			sqlSession = build.openSession(true);
			return sqlSession;
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (resourceAsStream != null) {
				try {
					resourceAsStream.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	public static void closeSqlSession() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
}
