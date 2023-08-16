package com.one.day3;

public class Split {
	public static void main(String[]args) {
		String a="Thilagan1 is2 a3 good4 boy5";
		String[] b=a.split("\\s+");		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		String d=b[0].toLowerCase();
		System.out.println(d);
		
		}

}
