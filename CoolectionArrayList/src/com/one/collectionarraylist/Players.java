package com.one.collectionarraylist;

public class Players {
	private String name;
	private int age;
	private String gender;
	private String teamName;
	private int runs;
	private int jerseyNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public Players(String name, int age, String gender, String teamName, int runs, int jerseyNo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.teamName = teamName;
		this.runs = runs;
		this.jerseyNo = jerseyNo;
	}
	
	public String toString() {
		return "Players [name=" + name + ", age=" + age + ", gender=" + gender + ", teamName=" + teamName + ", runs="
				+ runs + ", jerseyNo=" + jerseyNo + "]";
	}
	

}
