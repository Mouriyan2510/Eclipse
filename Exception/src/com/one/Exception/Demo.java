package com.one.Exception;

public class Demo {
	public static void main(String [] args) {
		
		int a=10;
		int b=0;
		
		System.out.println(a);
		System.out.println(b);
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException t) {
//			System.out.println("Don't try to divide any number by zero");
//			System.out.println(t);
			t.printStackTrace();
			}
		System.out.println(a+b);
		System.out.println(a-b);
	}

}
