package Volante;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance.");
        }
    }
}

public class BalanceRe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("Current balance: $" + account.getBalance());
            System.out.print("Enter transaction type (1 for deposit, 2 for withdrawal, 0 to exit): ");
            int transactionType = scanner.nextInt();

            if (transactionType == 0) {
                break;
            } else if (transactionType == 1) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
            } else if (transactionType == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        }

        System.out.println("Thank you for using the Bank System!");
    }
}

