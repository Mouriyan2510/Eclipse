package com.one.dayyy;

public class Vowels {
	public static void main(String [] args) {
		String a="Vinoliya";
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				System.out.println("Given "+a+" COntains "+a.charAt(i));
			}
		}
	}

}
