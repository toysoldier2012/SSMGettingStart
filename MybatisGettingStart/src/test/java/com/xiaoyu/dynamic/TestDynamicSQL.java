package com.xiaoyu.dynamic;

import com.xiaoyu.dynamic.mapper.DynamicSQLMapper;
import com.xiaoyu.mybatis.utils.SqlSessionUtil;
import com.xiaoyu.sakila.mapper.CountryMapper;
import com.xiaoyu.sakila.pojo.City;
import com.xiaoyu.sakila.pojo.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestDynamicSQL {

	@Test
	public void testDynamicSearchCity(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

		City cityCondition = new City(50, "ab", null);

		List<City> citiesByCondition = mapper.getCitiesByCondition(cityCondition);
		System.out.println(citiesByCondition);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testInsertCities(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
		CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);

		Timestamp now = new Timestamp(new Date().getTime());

		Country china = countryMapper.getCountryByName("China");

		City jinan = new City(null, "Jinan", now);
		jinan.setCountry(china);
		City wuhan = new City(null, "Wuhan", now);
		wuhan.setCountry(china);

		List<City> cities = Arrays.asList(jinan, wuhan);

		dynamicSQLMapper.insertCities(cities);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testDeleteCities(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);

		dynamicSQLMapper.deleteCities(new Integer[]{601, 602, 603, 604});

		SqlSessionUtil.closeSqlSession();
	}
}
