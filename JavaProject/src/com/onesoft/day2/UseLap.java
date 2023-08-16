package com.onesoft.day2;

public class UseLap {
	public static void main(String []args){
		Lap lap1= new Lap();
		lap1.brand="HP";
		lap1.price=67000;
		lap1.taxAmount=3000;
		lap1.discountAmount=6000;
		lap1.netPrice=lap1.price + lap1.taxAmount - lap1.discountAmount;
		System.out.println("Brand= "+lap1.brand+"\nPrice= "+lap1.price+"\nNetPrice= "+lap1.netPrice);
	}

}
