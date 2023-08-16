package com.one.polymorphism;

public class Max {
	public int findMax(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public int findMax(int []a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				a[i]=max;
			}
		}
	return max;
	}

}
