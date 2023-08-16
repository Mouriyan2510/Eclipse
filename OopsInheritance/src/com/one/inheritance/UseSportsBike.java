package com.one.inheritance;

public class UseSportsBike {
	public static void main(String [] args) {
		SportsBike sb=new SportsBike();
		System.out.println(sb.brand("Audi"));
		System.out.println(sb.color("Red"));
		System.out.println("CC= "+ sb.cc(3000));
		System.out.println("PRICE= "+sb.price(123453));
		System.out.println("Weight= "+sb.weight(5000));
		System.out.println("SPEED= "+sb.speed(1000));
	}

}
