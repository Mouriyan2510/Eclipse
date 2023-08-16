package com.one.for2;

public class Vowels {
	public static void main(String [] args) {	
	String [] a= {"athan","ethan","somu"};
	int b=0;
	for(int i=0;i<a.length;i++) {
		if(a[i].charAt(0)=='a'||a[i].charAt(0)=='e'||a[i].charAt(0)=='i'||a[i].charAt(0)=='o'||a[i].charAt(0)=='u') {
		b=b+1;	
		}

}
	System.out.println(b);
	}}
