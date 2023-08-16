package com.one.day3;

public class UsePen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.brand="Parker";
		p1.price=10;
		p1.color="BLUE";
		p1.isBlue=true;
		String a=(p1.brand).toUpperCase();
		int b=a.length();
		char c=a.charAt(5);
		System.out.println(c);
	}
}
