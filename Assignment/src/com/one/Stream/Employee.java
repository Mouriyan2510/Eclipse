package com.one.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private String designation;
	private int age;
	private String gender;
	private int salary;
	private int count;
//	public String age(int age) {
//		if(age>30 && age<50) {
//		return name+" "+designation+" "+age;
//		}
//		else {
//			return "Invalid";
//		}
//	}
//	public String Gender(String gender) {
//		if(gender.equalsIgnoreCase("female")) {
//			return name+" "+designation+" "+age+" "+gender;
//		}
//		else {
//			return name+" "+designation+" "+age+" "+gender;
//		}
//	}
//	public int ageCount(int age) {
//		int c=0;
//		if(age>30 && age<50) {
//		return c++;
//		}
//		else {
//			return  0;
//		}
//	}
//	public String salary(int salary) {
//		if(salary>20000) {
//			return name+" "+designation+" "+age+" "+gender+" "+salary;
//		}
//		else {
//			return "Invalid";
//		}
//	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Employee> age(int age,List<Employee> li){
		return li.stream().filter(r-> r.getAge()>20).collect(Collectors.toList());
	}
	public long countt(int age,List<Employee> li){
		return li.stream().filter(u-> u.getAge()>23).count();
	}
	public Employee(String name, String designation, int age, String gender, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	
	

}
