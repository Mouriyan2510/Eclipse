package com.one.compositionOops;

public class UseMobile {
	public static void main(String [] args) {
		Battery b1=new Battery();
		b1.setCapacity(4500);
		b1.setPrice(10000);
		Mobile m1=new Mobile ();
		m1.setBrand("Oneplus");
		m1.setPrice(30000);
		m1.setBattery(b1);
		System.out.println(m1.getBrand()+" "+m1.getPrice());
		System.out.println(m1.getBattery().getCapacity()+" "+m1.getBattery().getPrice());
	}

}
