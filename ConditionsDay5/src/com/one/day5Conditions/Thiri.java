package com.one.day5Conditions;

public class Thiri {
	public static void main(String [] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b&&a>c) {
			System.out.println(a+"is larger");
		}
		else if(b>a&&b>c) {
			System.out.println(b+"is larger");
		}
		else {
			System.out.println(c+"is larger");
		}
	}

}
