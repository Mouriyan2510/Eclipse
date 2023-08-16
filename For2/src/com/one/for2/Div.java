package com.one.for2;

public class Div {
	public static void main(String [] args) {
		int[] a= {1,2,3,5,10,13,20,25,95,100,105,92,103};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%5==0) {
				continue;
			}
			else if(a[i]>=100) {
				break;
			}
			System.out.println(a[i]);
		}
	}
}
