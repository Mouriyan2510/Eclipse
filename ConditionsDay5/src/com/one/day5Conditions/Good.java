package com.one.day5Conditions;

public class Good {
	public static void main(String [] args) {
		int a=Integer.parseInt(args[0]);
		if(a>=1&&a<6) {
			System.out.println("Good Morning");
		}
		else if(a>=6&&a<12) {
			System.out.println("Good afterNoon");
		}
		else if(a>=12&&a<18) {
			System.out.println("Good evening");
		}
		else if(a>=18&&a<=24) {
			System.out.println("Good night");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
