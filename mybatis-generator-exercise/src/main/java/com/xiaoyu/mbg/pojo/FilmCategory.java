package com.xiaoyu.mbg.pojo;

import java.util.Date;

public class FilmCategory extends FilmCategoryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_category.last_update
     *
     * @mbggenerated Tue Mar 07 11:48:05 CET 2023
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_category.last_update
     *
     * @return the value of film_category.last_update
     *
     * @mbggenerated Tue Mar 07 11:48:05 CET 2023
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_category.last_update
     *
     * @param lastUpdate the value for film_category.last_update
     *
     * @mbggenerated Tue Mar 07 11:48:05 CET 2023
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}