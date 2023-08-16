package com.one.day5Conditions;

public class Class {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		if(a>60&&a<=75) {
			System.out.println("Third Class");
		}
		else if(a>75&&a<=90) {
			System.out.println("Second Class");
		}
		else if(a>90&&a<=100) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
