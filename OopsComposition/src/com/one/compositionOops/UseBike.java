package com.one.compositionOops;

public class UseBike {
	public static  void main(String [] args) {
		Enginee e1=new Enginee(10000,8);
		Bike b1=new Bike("FZv3",180000,"Matt Blue",e1);
		
		System.out.println(b1.getBrand()+" "+b1.getPrice()+" "+b1.getColor());
		System.out.println(b1.getEnginee().getPrice()+" "+b1.getEnginee().getPiston());
	}

}
