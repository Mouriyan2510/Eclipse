package com.one.collectionarraylist;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String []args) {
		Employee e1=new Employee("Mouri", 25, "Male", 40000);
		Employee e2=new Employee("Raju", 45, "Male", 30000);
		Employee e3=new Employee("Ragu", 35, "Female", 28000);
		Employee e4=new Employee("Sivya", 25, "Female", 37000);
		ArrayList <Employee> emp=new ArrayList <Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		int temp=e1.getSalary();
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getAge()>35) {
				temp=(emp.get(i).getSalary()+(emp.get(i).getSalary()*12)/100);
				emp.get(i).setSalary(temp);
			}
		}
		
	System.out.println(e2);
	}
}
