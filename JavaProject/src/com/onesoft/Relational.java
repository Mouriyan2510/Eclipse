package com.onesoft;

public class Relational {
	public static void main(String[]args) {
		int a=600;
		int b=200;
		int c=600;
		boolean isGreater = a>b;
		System.out.println(a+" is greater than "+b+" = "+isGreater);
		boolean isLesser=a<b;
		System.out.println(a+" is lesser than "+b+" = "+isLesser);
		System.out.println(a+" greater than or equal to "+b+"="+(a>=b));
		System.out.println(a+" lesser than or equal to "+b+"="+(a>=b));
		System.out.println(a+" equals to "+c+"="+(a==c));
		System.out.println(a+" not equals to "+c+"="+(a!=c));
	}

}
