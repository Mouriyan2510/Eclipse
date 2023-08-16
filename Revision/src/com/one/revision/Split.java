package com.one.revision;

public class Split {
	public static void main(String[]args) {
		String a="Helllo";
		String[]b=a.split("l");
		String c="Ram is a good boy";
		String[] d=a.split("[a-z]");
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
	}

}
