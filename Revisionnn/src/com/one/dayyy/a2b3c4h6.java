package com.one.dayyy;

public class a2b3c4h6 {
	public static void main(String[] args) {
		String a="a2b3c4h6";
		String b="";
		for(int i=0;i<a.length();i=i+2) {
			char ch=a.charAt(i);
			int count=Character.getNumericValue(a.charAt(i+1));
			for(int j=0;j<count;j++) {
				b=b+ch;
			}
		}
		System.out.println(b);
	}

}
