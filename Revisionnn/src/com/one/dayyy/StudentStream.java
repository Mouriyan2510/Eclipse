package com.one.dayyy;

public class StudentStream {
	private String name;
	private char initial;
	private int Salary;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public StudentStream(String name, char initial, int salary, int age) {
		super();
		this.name = name;
		this.initial = initial;
		Salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentStream [name=" + name + ", initial=" + initial + ", Salary=" + Salary + ", age=" + age + "]";
	}
	
	
}
