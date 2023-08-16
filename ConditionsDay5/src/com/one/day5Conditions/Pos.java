package com.one.day5Conditions;

public class Pos {
	public static void main(String [] args) {
		int a=Integer.parseInt(args[0]);
		if(a>0) {
			System.out.println("Positive");
					}
		else if(a==0) {
			System.out.println("Neutral");
		}
		else {
			System.out.println("Negative");
		}
	}
}
