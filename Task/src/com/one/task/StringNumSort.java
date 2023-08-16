package com.one.task;

import java.util.Arrays;

public class StringNumSort {
	public static void main(String[] args) {
		String a="1,8,5,3,2";
		char[]c=a.toCharArray();
		String b="";
		for(int i=0;i<a.length();i=i+2) {
			b=b+c[i];
		}

//		System.out.println(b);
		char[]g=b.toCharArray();
//		System.out.println(g);
		Arrays.sort(g);
		System.out.println(g);
	}

}
