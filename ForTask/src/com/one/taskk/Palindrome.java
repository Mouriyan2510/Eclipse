package com.one.taskk;

public class Palindrome {
	public static void main(String [] args) {
		
	
	String a="MadaM";
	String b="";
	char []c=a.toCharArray();
	for(int i=a.length()-1;i>=0;i--) {
		b=b+c[i];
	}
	if(b.equals(a)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not");
	}

}
}
