package com.one.day5Conditions;

public class Sample {
	public static void main(String[]args) {
		String a=args[0];
		if(a.endsWith("s")) {
			System.out.println(a+" is Plural");
		}
		else {
			System.out.println(a+" is singular");
		}
	}
}
