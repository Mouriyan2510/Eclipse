package com.one.day5Conditions;

public class Ac {
	public static void main(String [] args) {
		int a=Integer.parseInt(args[0]);
		if(a>=17&&a<=20) {
			System.out.println("Very Cooling");
		}
		else if(a>=21&&a<=24) {
			System.out.println("Cool");
		}
		else if(a>=25&&a<=28) {
			System.out.println("Average");
		}
		else if(a>=29&&a<=30) {
			System.out.println("Room Temp");
		}
		else if(a>=31) {
			System.out.println("hot");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
