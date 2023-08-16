package com.one.for2;

public class Caps {
	public static void main(String [] args) {
		String a[]=args[0].split(",");
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(i)>=65 && a[i].charAt(i)<= 90) {
				System.out.println(a[i]);
			}
			else {
				continue;
			
			}
		}
	}

}
