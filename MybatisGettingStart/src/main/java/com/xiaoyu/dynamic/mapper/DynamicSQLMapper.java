package com.xiaoyu.dynamic.mapper;

import com.xiaoyu.sakila.pojo.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
	List<City> getCitiesByCondition(City city);

	void insertCities(@Param("cities") List<City> listCities);

	void deleteCities(@Param("citiesId") Integer[] citiesId);
}
