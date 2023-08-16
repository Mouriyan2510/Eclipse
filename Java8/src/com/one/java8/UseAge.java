package com.one.java8;

public class UseAge {
	public static void main(String [] args) {
		Age z=(a)-> {
			if(a>=18) {
				return a+" Eligible for Voter";
			}
			else if(a>25&&a<40) {
				return a+" Eligible for election";
			}
			else {
				return a+"Not Eligible";
			}
		};
		System.out.println(z.eligible(27));
	}

}
