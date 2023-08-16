package com.one.dayyy;

public class UseFunctinalInterface {
	public static void main(String [] args) {
		FunctionalInter fi=(a,b)->{
			if(a>b) {
				System.out.println(a+" is higher than "+b);
			}
			else {
				System.out.println(b+" is higher than "+a);
			}
		};
		
		fi.getHigh(10, 30);
	}

}
