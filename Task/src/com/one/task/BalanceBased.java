package com.one.task;

import java.util.Scanner;

public class BalanceBased {
	
	private static double balance=1000.00;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome to the Banking System!!!");
		System.out.println("Your Current balance is: "+balance);
		
		while(true) {
			System.out.print("Enter the Withdrawl amount (or) To exit enter 0: ");
			double withdrawl=scanner.nextDouble();
			if(withdrawl==0) {
				break;
			}
			
			if(withdrawl>0 && withdrawl<=balance) {
				System.out.println("Enter your amount: ");
				balance=balance-withdrawl;
				System.out.println("Withdrawl successfully");
				System.out.println("Your Current balance is: "+ balance);
			}
			if(withdrawl>balance) {
				System.out.println("Insufficient balance....Check your Balance "+balance);
			}
			
			}
		
		System.out.println("Thanks fo using our banking system....");
	}

}
