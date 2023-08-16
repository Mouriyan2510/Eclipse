package com.one.polymorphism;

public class LoanEligible {
	public int checkLoanEligible() {
		return 30000;
	}
	public int checkLoanEligible(int salary) {
		return 30000+(salary*5);
	}
	public int checkLoanEligible(int salary,int propertValue) {
		return 30000+(salary*5)+(propertValue*10);
	}
}
