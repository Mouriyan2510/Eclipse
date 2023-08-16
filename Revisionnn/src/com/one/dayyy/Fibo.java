package com.one.dayyy;

public class Fibo {
	public static void man(String [] args) {
		
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<10;i++) {
			
			 c=a+b;
			
			System.out.println(a);
			a=b;
			b=c;
			
		}
	}
}
