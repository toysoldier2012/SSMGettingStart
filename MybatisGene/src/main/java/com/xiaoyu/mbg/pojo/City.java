package com.xiaoyu.mbg.pojo;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.ID
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Name
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.CountryCode
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String countrycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.District
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String district;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Population
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Integer population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.ID
     *
     * @return the value of city.ID
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.ID
     *
     * @param id the value for city.ID
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Name
     *
     * @return the value of city.Name
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Name
     *
     * @param name the value for city.Name
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.CountryCode
     *
     * @return the value of city.CountryCode
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.CountryCode
     *
     * @param countrycode the value for city.CountryCode
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.District
     *
     * @return the value of city.District
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.District
     *
     * @param district the value for city.District
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Population
     *
     * @return the value of city.Population
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Population
     *
     * @param population the value for city.Population
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}