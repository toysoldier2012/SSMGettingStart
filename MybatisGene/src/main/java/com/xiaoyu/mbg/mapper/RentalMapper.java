package com.xiaoyu.mbg.mapper;

import com.xiaoyu.mbg.pojo.Rental;
import com.xiaoyu.mbg.pojo.RentalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int countByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByPrimaryKey(Integer rentalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insert(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insertSelective(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    List<Rental> selectByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    Rental selectByPrimaryKey(Integer rentalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExampleSelective(@Param("record") Rental record, @Param("example") RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExample(@Param("record") Rental record, @Param("example") RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKeySelective(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKey(Rental record);
}