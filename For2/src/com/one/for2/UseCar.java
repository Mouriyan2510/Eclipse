package com.one.for2;

public class UseCar {
	public static void main(String [] args) {
			
		Car car1=new Car();
		car1.brand="Maruti";
		car1.price=100000;
		car1.color="Red";
		Car car2=new Car();
		car2.brand="Hyundai";
		car2.price=600000;
		car2.color="White";
		Car car3=new Car();
		car3.brand="Datsun";
		car3.price=900000;
		car3.color="Blue";
		Car[] cars= {car1,car2,car3};
		Car temp=cars[1];
		for(int i=0;i<cars.length;i++) {
			if(temp.price<cars[i].price) {
				
				System.out.println(cars[i].brand+cars[i].price)	;
			}
			
		}
	
		
	}
}
