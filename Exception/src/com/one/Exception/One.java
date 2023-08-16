package com.one.Exception;

public class One {
	public int num(int a) {
		System.out.println(a);
		return a;
	}
public static void main(String [] args) {
	One z=new One();
	System.out.println(z.num(10));
}
}
