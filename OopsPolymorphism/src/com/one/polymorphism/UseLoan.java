package com.one.polymorphism;

public class UseLoan {
	public static void main(String [] args)
	{
		LoanEligible l=new LoanEligible();
		System.out.println("LOAN AMOUNT: "+l.checkLoanEligible());
		System.out.println("LOAN AMOUNT: "+l.checkLoanEligible(40000));
		System.out.println("LOAN AMOUNT: "+l.checkLoanEligible(45000, 100000));
	}

}
