package com.one.inheritance;

public class Student {
	private String name;
	private int id;
	private String dep;
	public Student(String name,int id,String dep) {
		this.name=name;
		this.id=id;
		this.dep=dep;
	}
	public String toString() {
		return "NAME= "+name+",ID= "+id+",DEP= "+dep;
	}

}
