package com.one.dayyy;

public class Checking {
	public static void main(String [] args) {
		int a=10;
		int b=7;
		for (int i=1;i<=a;i++) {


			if(i==b) {
				continue;
			} 
			
			else {
				System.out.println(i);
			}
		}
	}
}
