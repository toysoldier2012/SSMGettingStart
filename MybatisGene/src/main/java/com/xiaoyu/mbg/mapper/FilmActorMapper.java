package com.xiaoyu.mbg.mapper;

import com.xiaoyu.mbg.pojo.FilmActor;
import com.xiaoyu.mbg.pojo.FilmActorExample;
import com.xiaoyu.mbg.pojo.FilmActorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmActorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int countByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int deleteByPrimaryKey(FilmActorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insert(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int insertSelective(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    List<FilmActor> selectByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    FilmActor selectByPrimaryKey(FilmActorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExampleSelective(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByExample(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKeySelective(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    int updateByPrimaryKey(FilmActor record);
}