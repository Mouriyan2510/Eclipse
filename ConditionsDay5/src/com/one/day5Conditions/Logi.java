package com.one.day5Conditions;

public class Logi {
public static void main(String [] args) {
	int a=Integer.parseInt(args[0]);
	if(a%2==0 && a%4==0) {
		System.out.println("Divisible by both");
		
	}
	else {
		System.out.println("Not");
	}
}
}
