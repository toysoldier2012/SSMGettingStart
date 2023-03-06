package com.xiaoyu.mbg.mapper;

import com.xiaoyu.mbg.pojo.City;
import com.xiaoyu.mbg.pojo.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int countByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    List<City> selectByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    City selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKey(City record);
}