package com.one.Exception;

public class test {
	public static void main(String [] args) {
		String a="java";
		String b="developer";
		String c=a.concat(b);
		System.out.println(c.substring(0,2).concat(c.substring(4).concat(c.substring(2,4))));
	}

}
