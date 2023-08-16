package com.one.day6;

public class StringReverse {
	public static void main(String [] args) {
		String a="Mouriyan";
		char b[]=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		for(int j=a.length()-1;j>=0;j--) {
			System.out.println(" "+b[j]);
		}
	}

}
