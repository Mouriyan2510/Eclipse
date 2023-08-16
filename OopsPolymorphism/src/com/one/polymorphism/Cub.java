package com.one.polymorphism;

public class Cub extends Bank{
	public int roi(int amt) {
		return amt*7/100;
	}
	public String eligible(String branch) {
		if(branch.equalsIgnoreCase("Perungudi")) {
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}

}}
