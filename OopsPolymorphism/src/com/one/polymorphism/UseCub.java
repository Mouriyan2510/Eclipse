package com.one.polymorphism;

public class UseCub {
	public static void main(String [] args) {
		Cub c=new Cub();
		c.branch="perungudi";
		c.accNo=123456789;
		System.out.println("ROI = "+c.roi(2000));
		System.out.println("Is Eligible = "+c.eligible(c.branch));
	}

}
