package com.xiaoyu.spring.pojo;

import com.xiaoyu.spring.HelloSpring;

import java.io.File;
import java.util.*;

public class Actor {
	private int id;
	private String name;
	private char gender;
	private Film film;
	private String[] hobby;
	private ArrayList<HelloSpring> helloSprings;
	private HashMap<String, Object> testMaps;

	@Override
	public String toString() {
		return "Actor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender=" + gender +
				", film=" + film +
				", hobby=" + Arrays.toString(hobby) +
				", helloSprings=" + helloSprings +
				", testMaps=" + testMaps +
				'}';
	}

	public HashMap<String, Object> getTestMaps() {
		return testMaps;
	}

	public void setTestMaps(HashMap<String, Object> testMaps) {
		this.testMaps = testMaps;
	}

	public Actor(int id, String name, char gender, Film film, String[] hobby, ArrayList<HelloSpring> helloSprings, HashMap<String, Object> testMaps) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.film = film;
		this.hobby = hobby;
		this.helloSprings = helloSprings;
		this.testMaps = testMaps;
	}

	public ArrayList<HelloSpring> getHelloSprings() {
		return helloSprings;
	}

	public void setHelloSprings(ArrayList<HelloSpring> helloSprings) {
		this.helloSprings = helloSprings;
	}

	public Actor(int id, String name, char gender, Film film, String[] hobby, ArrayList<HelloSpring> helloSprings) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.film = film;
		this.hobby = hobby;
		this.helloSprings = helloSprings;
	}

	public Actor() {
	}

	public Actor(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Actor(int id, String name, char gender, Film film) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.film = film;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public Actor(int id, String name, char gender, Film film, String[] hobby) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.film = film;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public void test(){
		System.out.println("Actor test....");
	}

}
