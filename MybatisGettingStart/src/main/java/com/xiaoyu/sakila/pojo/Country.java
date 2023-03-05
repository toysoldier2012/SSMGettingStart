package com.xiaoyu.sakila.pojo;

import java.sql.Timestamp;
import java.util.List;

public class Country {
	private int countryId;
	private String country;
	private Timestamp lastUpdate;
	private List<City> listCities;

	public Country() {
	}

	public Country(int countryId, String country, Timestamp lastUpdate) {
		this.countryId = countryId;
		this.country = country;
		this.lastUpdate = lastUpdate;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<City> getListCities() {
		return listCities;
	}

	public void setListCities(List<City> listCities) {
		this.listCities = listCities;
	}

	@Override
	public String toString() {
		return "Country{" +
				"countryId=" + countryId +
				", country='" + country + '\'' +
				", lastUpdate=" + lastUpdate +
				", listCitys=" + listCities +
				'}';
	}
}
