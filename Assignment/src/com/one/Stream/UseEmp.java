package com.one.Stream;

import java.util.ArrayList;
import java.util.List;

public class UseEmp {
	public static void main(String [] args) {
		Employee e1=new Employee("Kathir","Devops",15,"Male",310000);
		Employee e2=new Employee("Mouri","Java",20,"Male",50000);
		Employee e3=new Employee("Naveen","Python",25,"Male",10000);
		Employee e4=new Employee("Shamla","Php",25,"Female",40000);
		Employee e5=new Employee("Priya","Java",25,"Female",19000);
		Employee e6=new Employee("Divya","AcMechanic",25,"Female",15000);
		
		ArrayList <Employee> k=new ArrayList<>();
		k.add(e1);
		k.add(e2);
		k.add(e3);
		k.add(e4);
		k.add(e5);
		k.add(e6);
		
		List <Employee> o=e1.age(e3.getAge(), k);
		o.forEach(t-> System.out.println(t));
//		System.out.println(e1.age(30,k));
//		System.out.println(e2.countt(e1.getSalary(), k));
//		k.forEach(t-> System.out.println(t.age(20, k)));
//		k.forEach(y-> System.out.println( y.age(30, k)));
	}

}
