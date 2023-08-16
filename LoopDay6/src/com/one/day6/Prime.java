package com.one.day6;

public class Prime {
	public static void main(String [] args) {
		int a=11;
		boolean isb=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				isb=false;
				
			}
			if(isb==true) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
		}
	}
}
