package com.one.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String [] args) {
		Car c1=new Car("Hyundai",70000,"Red",4);
		Car c2=new Car("Maruti",65000,"Blue",5);
		Car c3=new Car("Hyundai",67000,"white",6);
		Car c4=new Car("Hyundai",90000,"Red",8);
		Car c5=new Car("Maruti",55000,"Red",7);
		ArrayList <Car> cars=new ArrayList <>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
//		System.out.println(cars);
		cars.forEach(r-> {
			if(r.getRating()%2==0) {
				System.out.println(r.getRating());
			}
		});
//		List <Integer> t=cars.stream().filter(y-> y.getRating()%2==0).map(i-> i.getRating()).collect(Collectors.toList());
//		t.forEach(u-> System.out.println(u));
		List <Car> t1=cars.stream().filter(y-> y.getColor().equals("Red")).collect(Collectors.toList());
		t1.forEach(u-> System.out.println(u));
	}
}
