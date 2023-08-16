package com.one.day5Conditions;

public class Rating {
	public static void main(String[]args) {
		int a=Integer.parseInt(args[0]);
		if(a==1) {
			System.out.println("Poor");
		}
		else if(a==2) {
			System.out.println("bad");
		}
		else if(a==3) {
			System.out.println("average");
		}
		else if(a==4) {
			System.out.println("Good");
		}
		else if(a==5) {
			System.out.println("Excellent");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
