package com.one.inheritance;

public class Teacher extends Employee{
	private String qua;
	private String dept;
	private int exp;
	
	public Teacher(String qua,String dept,int exp) {
		this.qua=qua;
		this.dept=dept;
		this.exp=exp;
	}
	public String toString() {
		return qua+" "+dept+" "+exp;
	}

}
