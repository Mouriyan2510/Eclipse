package com.one.polymorphism;

public class Bank {
	String branch;
	long accNo;
	public int roi(int amt) {
		return amt*5/100;
	}
	public String eligible(String branch) {
		if(branch.equalsIgnoreCase("Chennai")) {
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}
	}

}
