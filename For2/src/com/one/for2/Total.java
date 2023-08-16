package com.one.for2;

public class Total {
	public static void main(String [] args) {
		int []a= {2,3,4,5,6,7};
		int b=0;
		for(int i=0;i<=a.length-1;i++) {
			b=b+a[i];
		}
		System.out.println(b);
	}
}
