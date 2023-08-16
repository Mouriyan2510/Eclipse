package com.one.dayyy;

public class One {
	public static void main(String [] args) {
		int a=7;
		int b;
		for(int i=2;i<a;i++) {
			if(a%2==0) {
				continue;
			}
		}
		if(a%2==0) {
			System.out.println(a+" Not a Prime No");
		}
		else {
			System.out.println(a+" Prime");
		}
	}

}
