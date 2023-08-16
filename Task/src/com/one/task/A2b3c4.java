package com.one.task;

public class A2b3c4 {
	public static void main(String [] args) {
		String a="aabbbcccc";
		String b="";
		int count=1;
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i)==a.charAt(i-1)) {
				count=count+1;
			}
			else {
				b=b+a.charAt(i-1)+ String.valueOf(count);
				count=1;
			}
		}
		b=b+a.charAt(a.length()-1)+String.valueOf(count);
		
		System.out.println(b);
	}

}
