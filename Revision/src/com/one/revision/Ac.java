package com.one.revision;

public class Ac {
	String brand;
	int price;
	String color;
	boolean isWarranty;
	int averagePrice;
	int temp;
	public int Decrease() {
		temp =temp-1;;
		return temp;
	}
	public int Increase() {
		temp +=1;
		return temp;
	}
	
	public void TurnOff() {
		System.out.println("AC is Turned Off");
	}
	
}
