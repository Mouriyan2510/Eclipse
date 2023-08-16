package com.onesoft.day2;

public class UseCar {
	public static void main(String []args) {
		Car car1= new Car();
		car1.company="Hyundai";
		car1.model="i20";
		car1.color="White";
		car1.price=1000000;
		System.out.println("Company= "+car1.company+" Model= "+car1.model+" Color= "+car1.color+" Price= "+car1.price);
		Car car2= new Car();
		car2.company="Hyundai";
		car2.model="Creta";
		car2.color="Black";
		car2.price=2100000;
		System.out.println("Company= "+car2.company+" Model= "+car2.model+" Color= "+car2.color+" Price= "+car2.price);
		Car car3= new Car();
		car3.company="Maruti";
		car3.model="Swift";
		car3.color="Cherry Red";
		car3.price=890000;
		System.out.println("Company= "+car3.company+" Model= "+car3.model+" Color= "+car3.color+" Price= "+car3.price);
		Car car4= new Car();
		car4.company="Datsun";
		car4.model="RediGo";
		car4.color="Red";
		car4.price=650000;
		System.out.println("Company= "+car4.company+" Model= "+car4.model+" Color= "+car4.color+" Price= "+car4.price);
		System.out.println("Ave= "+(car1.price+car2.price+car3.price+car4.price/4));
	}

}
