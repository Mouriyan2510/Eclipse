package com.one.task;

import java.util.Scanner;

public class BalanceFull {

	private double balance;

	public BalanceFull(double initialBalance) {
		balance = initialBalance;
	}

	public double getbalance() {
		return balance;
	}

	// deposit

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited Successfuly..." + "Your current balance is: " + balance);
		} else {
			System.out.println("Invalid amount");
		}
	}

	// withdrawl

	public void withdrawl(double amount) {
		if (amount == 0) {
			System.out.println("Enter the Withdrawl amount (or) To exit enter 0: ");
		} 
		else if (amount > 0 || amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawl Successfuly..." + "Your current balance is: " + balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public class balance{
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the initial amount: ");
			double initial= scan.nextDouble();
			
			BalanceFull bf=new BalanceFull(initial);
			
			while(true) {
				System.out.println("Your Current balance is: "+bf.getbalance());
				System.out.print("Enter transaction type (1 for deposit, 2 for withdrawal, 0 to exit): ");
	            int transactionType = scan.nextInt();
	            if (transactionType == 0) {
	                break;
	            } else if (transactionType == 1) {
	                System.out.print("Enter deposit amount: ");
	                double depositAmount = scan.nextDouble();
	                bf.deposit(depositAmount);
	            } else if (transactionType == 2) {
	                System.out.print("Enter withdrawal amount: ");
	                double withdrawalAmount = scan.nextDouble();
	                bf.withdrawl(withdrawalAmount);
	            } else {
	                System.out.println("Invalid transaction type.");
	            }
	        }

	        System.out.println("Thank you for using the Bank System!");
			}
			
		}
	}
		


