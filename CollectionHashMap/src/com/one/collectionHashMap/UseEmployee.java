package com.one.collectionHashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String []args) {
		Employee e1=new Employee("Mouri",25,"Male",1191,40000,"Java Developer");
		Employee e2=new Employee("Naveen",17,"Male",1187,10000,"Python Developer");
		Employee e3=new Employee("Muthu",27,"Male",1167,80000,"Php Developer");
		Employee e4=new Employee("Varuni",30,"Female",1156,90000,"Front Developer");
		Employee e5=new Employee("Shamla",29,"Female",1160,50000,"Java Developer");
		Employee e6=new Employee("Kathir",12,"Male",1190,12000,"Devops Developer");
		Employee e7=new Employee("Ravi",28,"Male",1112,37000,"Full Stack Developer");
		HashMap <Integer,Employee> emps=new HashMap <>();
		HashMap <Integer,Employee> feEmps=new HashMap <>();
		HashMap <Integer,Employee> MaEmps=new HashMap <>();
		emps.put(e1.getId(), e1);
		emps.put(e2.getId(), e2);
		emps.put(e3.getId(), e3);
		emps.put(e4.getId(), e4);
		emps.put(e5.getId(), e5);
		emps.put(e6.getId(), e6);
		emps.put(e7.getId(), e7);
		for(Employee x:emps.values()) {
			System.out.println(x);
		}
//		for(Integer z:emps.keySet()) {
//			System.out.println(emps.get(z));
//		}
//		for(Employee s:emps.values()) {
//			if(s.getSalary()>20000 && s.getSalary()<50000);
//			System.out.println(s);
//		}
//		emps.values().forEach(x-> {
//			if(x.getSalary()>20000 && x.getSalary()<50000);
//			System.out.println(x);
//		});
//		emps.keySet().forEach(x-> {
//			if(emps.get(x).getSalary()>20000) {
//				System.out.println(emps.get(x));
//			}
//		});
		
//		emps.values().forEach(s-> {
//			if(s.getGender().equalsIgnoreCase("female")) {
//				feEmps.put(s.getId(),s);
//			}
//			else {
//				MaEmps.put(s.getId(), s);
//			}
//		});
		
//		for(Integer x:emps.keySet()) {
//			if(emps.get(x).getAge()>18) {
//				feEmps.put(x, emps.get(x));
//			}
//		}
//		feEmps.values().forEach(z-> System.out.println(z));
//	System.out.println(feEmps);
//	System.out.println(MaEmps);
//	MaEmps.values().forEach(x-> System.out.println(x));
//	feEmps.values().forEach(x-> System.out.println("\n"+x));
		
//		emps.keySet().forEach(x-> {
//			if(emps.get(x).getAge()<=18) {
//				emps.remove(x);
//			}
//		});
//	emps.values().forEach(z-> System.out.println(z));
//		System.out.println(emps);
		
//		Iterator <Employee> x=emps.values().iterator();
//		while(x.hasNext()) {
//			if(x.next().getAge()<=18) {
//				x.remove();
//			}
//		}
//	emps.values().forEach(z-> System.out.println(z));
//	}
//	
	}
	
}