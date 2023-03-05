package com.xiaoyu.sakila;

import com.xiaoyu.sakila.mapper.CountryMapper;
import com.xiaoyu.sakila.pojo.Country;
import com.xiaoyu.sakila.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestCountry {
	@Test
	public void testGetCountrys(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
		List<Country> countrys = mapper.getCountrys();
		System.out.println(countrys);
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetCountryAndHisCitiesById(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);

		Country countrys = mapper.getCountryAndHisCitiesById(44);
		System.out.println(countrys);

		SqlSessionUtil.closeSqlSession();
	}
}
