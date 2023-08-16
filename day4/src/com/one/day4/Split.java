package com.one.day4;

public class Split{
	public static void main(String[]args) {
		String[] a=args[0].split("-");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		String d=a[2];
		boolean e=Boolean.parseBoolean(a[3]);
		long f=Long.parseLong(a[4]);
		System.out.println(b+" "+c+" "+d+" "+e+" "+f);
	}

}
