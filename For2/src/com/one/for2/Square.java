package com.one.for2;

public class Square {
	public static void main(String [] args) {
		int []a= {2,3,4,5,6,8};
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b=b+1;
			}
			else {
				c=c+1;
			}
			
		}
		System.out.println(b);
		System.out.println(c);
	}

}
