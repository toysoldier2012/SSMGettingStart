package com.xiaoyu.sakila;

import com.xiaoyu.sakila.utils.SqlSessionUtil;
import org.junit.Test;

public class TestUtils {
	@Test
	public void testConnection(){
		SqlSessionUtil.getSqlSession();
		SqlSessionUtil.closeSqlSession();
	}

}
