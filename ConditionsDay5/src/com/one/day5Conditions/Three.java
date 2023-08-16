package com.one.day5Conditions;

public class Three {
	public static void main(String [] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a+b==c) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
	}

}
