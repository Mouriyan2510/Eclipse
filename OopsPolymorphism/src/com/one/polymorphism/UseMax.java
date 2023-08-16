 package com.one.polymorphism;

public class UseMax {
	public static void main(String []args) {
		Max m=new Max();
		int []nums= {12,2,5,6,7,345,8,9};
		System.out.println("MAX NUM: "+m.findMax(10,100));
		System.out.println("MAX NUM: "+m.findMax(nums));
	}

}
