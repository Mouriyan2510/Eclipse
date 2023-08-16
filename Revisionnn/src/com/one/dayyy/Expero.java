package com.one.dayyy;

public class Expero {
	public static void main(String [] args) {
		String a="URiYAn";
		int ab=0;
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				ab=ab+1;
			}
		}
		System.out.println(ab);
	}

}
