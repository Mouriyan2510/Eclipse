package com.one.for2;

public class Great {
	public static void main(String [] args) {
		int []a= {2,99999,3,4,5,96,7,99,98764};
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<b) {
				b=a[i];
			}
		}
		System.out.println(b);
	}
}
