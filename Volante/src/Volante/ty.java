package Volante;

import java.util.Scanner;

public class ty {

    private static double balance = 1000.0; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank System!");
        System.out.println("Your initial balance: $" + balance);

        while (true) {
            System.out.print("Enter withdrawal amount (0 to exit): ");
            double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount == 0) {
                break;
            }

            if (isValidWithdrawal(withdrawalAmount)) {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: $" + balance);
            } else {
                System.out.println("Withdrawal failed: Insufficient balance.");
            }
        }

        System.out.println("Thank you for using the Bank System!");
    }

    public static boolean isValidWithdrawal(double withdrawalAmount) {
        return withdrawalAmount > 0 && withdrawalAmount <= balance;
    }
}
