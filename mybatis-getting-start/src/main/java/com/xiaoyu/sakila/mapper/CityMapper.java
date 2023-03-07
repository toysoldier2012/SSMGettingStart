package com.xiaoyu.sakila.mapper;

import com.xiaoyu.sakila.pojo.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
	City getCityById(@Param("id") int id);

	City getCityAndHisCountryById(@Param("id") int id);

	List<City> getCitiesByCountryId(@Param("countryId") int countryId);
}
