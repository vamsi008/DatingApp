package com.flip.dating;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class User {

	Integer id;
	Location loc;
	List<String> intrests;
	String gender;
	Integer age;
	Map<Integer,List<User>> matches=new TreeMap<Integer,List<User>>();

	public User(Integer age, String gender, List<String> intrests, Location loc) {

		this.age = age;
		this.gender = gender;
		this.intrests = intrests;
		this.loc = loc;
	

	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public List<String> getIntrests() {
		return intrests;
	}

	public void setIntrests(List<String> intrests) {
		this.intrests = intrests;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Map<Integer, List<User>> getMatches() {
		return matches;
	}

	public void setMatches(Map<Integer, List<User>> matches) {
		this.matches = matches;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	

}
