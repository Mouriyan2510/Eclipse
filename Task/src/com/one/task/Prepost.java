package com.one.task;

public class Prepost {
	public static void main(String [] args) {
		int a=10;
		int b=a++ + ++a + a++ + ++a + ++a;
		System.out.println(b);
	}

}