package com.xiaoyu.sakila;

import com.xiaoyu.sakila.mapper.CityMapper;
import com.xiaoyu.sakila.pojo.City;
import com.xiaoyu.sakila.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCity {
	@Test
	public void testGetCityById(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();

		CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
		City city = cityMapper.getCityById(1);
		System.out.println(city);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetCityCountryById(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();

		CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
		City city = cityMapper.getCityAndHisCountryById(1);
		System.out.println(city.getCountry());

		SqlSessionUtil.closeSqlSession();
	}
}
