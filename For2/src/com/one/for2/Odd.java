package com.one.for2;

public class Odd {
	public static void main(String [] args) {
		int []a= {2,3,4,5,6,7,8,9,10};
		int b=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				b=b+a[i];
			}
			
		}
		System.out.println(b);	
	}

}
