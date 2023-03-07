package com.xiaoyu.sakila.pojo;

import java.sql.Timestamp;

public class City {
	private Integer id;
	private String name;
	private Timestamp lastUpdate;
	private Country country;

	public City() {
	}

	public City(Integer id, String name, Timestamp lastUpdate) {
		this.id = id;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", name='" + name + '\'' +
				", lastUpdate=" + lastUpdate +
				", country=" + country +
				'}';
	}
}