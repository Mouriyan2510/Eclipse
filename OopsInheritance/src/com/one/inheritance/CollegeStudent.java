package com.one.inheritance;

public class CollegeStudent extends Student{
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public CollegeStudent(String name,int id,String dept,int year) {
		super(name, id, dept);
		this.year=year;
	}
	public String toString() {
		return super.toString()+",YEAR= "+year;
	}

}
