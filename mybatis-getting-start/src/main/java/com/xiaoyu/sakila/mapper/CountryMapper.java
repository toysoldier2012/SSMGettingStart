package com.xiaoyu.sakila.mapper;

import com.xiaoyu.sakila.pojo.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryMapper {
	List<Country> getCountrys();

	Country getCountryById(@Param("countryId") int countryId);

	Country getCountryByName(@Param("countryName") String countryName);

	Country getCountryAndHisCitiesById(@Param("countryId") int countryId);
}
