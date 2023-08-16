package com.one.task;

public class Aabbcc {
	public static  void main(String [] args) {
		String a="a2b3c4h6";
		String b="";
		for(int i=0;i<a.length();i=i+2) {
			char c=a.charAt(i);
			int count=Character.getNumericValue(a.charAt(i+1));
		for(int j=0;j<count;j++) {
			b=b+c;
		
		}
		}
		System.out.println(b);
	}

}
