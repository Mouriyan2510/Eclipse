package Volante;

import java.util.Scanner;

public class TransactionDocumentGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction type: ");
        String transactionType = scanner.nextLine();

        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();

        scanner.nextLine();  // Consume newline

        System.out.print("Enter transaction date: ");
        String date = scanner.nextLine();

        System.out.print("Enter transaction description: ");
        String description = scanner.nextLine();

        // Process the input and generate the document
        generateTransactionDocument(transactionType, amount, date, description);

        scanner.close();
    }

    public static void generateTransactionDocument(String transactionType, double amount, String date, String description) {
        // Document generation logic
        System.out.println("\nTransaction Document:");
        System.out.println("Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }
}
