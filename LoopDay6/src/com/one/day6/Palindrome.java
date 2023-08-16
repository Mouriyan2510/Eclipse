package com.one.day6;

public class Palindrome {
	public static void main(String [] args) {
		String a="MalayalaM";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+(a.charAt(i));
		}
		if(a.equals(b)) {
			System.out.println("Given Input is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
