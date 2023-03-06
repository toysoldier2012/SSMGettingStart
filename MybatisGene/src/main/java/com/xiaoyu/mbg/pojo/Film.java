package com.xiaoyu.mbg.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Film {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.film_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Short filmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.title
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.release_year
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Date releaseYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Byte languageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.original_language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Byte originalLanguageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.rental_duration
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Byte rentalDuration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.rental_rate
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private BigDecimal rentalRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.length
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Short length;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.replacement_cost
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private BigDecimal replacementCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.rating
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String rating;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.special_features
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String specialFeatures;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.last_update
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private Date lastUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film.description
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.film_id
     *
     * @return the value of film.film_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.film_id
     *
     * @param filmId the value for film.film_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.title
     *
     * @return the value of film.title
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.title
     *
     * @param title the value for film.title
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.release_year
     *
     * @return the value of film.release_year
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Date getReleaseYear() {
        return releaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.release_year
     *
     * @param releaseYear the value for film.release_year
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.language_id
     *
     * @return the value of film.language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Byte getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.language_id
     *
     * @param languageId the value for film.language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.original_language_id
     *
     * @return the value of film.original_language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.original_language_id
     *
     * @param originalLanguageId the value for film.original_language_id
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.rental_duration
     *
     * @return the value of film.rental_duration
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Byte getRentalDuration() {
        return rentalDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.rental_duration
     *
     * @param rentalDuration the value for film.rental_duration
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.rental_rate
     *
     * @return the value of film.rental_rate
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.rental_rate
     *
     * @param rentalRate the value for film.rental_rate
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.length
     *
     * @return the value of film.length
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Short getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.length
     *
     * @param length the value for film.length
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setLength(Short length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.replacement_cost
     *
     * @return the value of film.replacement_cost
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.replacement_cost
     *
     * @param replacementCost the value for film.replacement_cost
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.rating
     *
     * @return the value of film.rating
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.rating
     *
     * @param rating the value for film.rating
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.special_features
     *
     * @return the value of film.special_features
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.special_features
     *
     * @param specialFeatures the value for film.special_features
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures == null ? null : specialFeatures.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.last_update
     *
     * @return the value of film.last_update
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.last_update
     *
     * @param lastUpdate the value for film.last_update
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film.description
     *
     * @return the value of film.description
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film.description
     *
     * @param description the value for film.description
     *
     * @mbggenerated Mon Mar 06 23:26:25 CET 2023
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}