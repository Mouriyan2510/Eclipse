package Volante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateTransInCsV {
	  public static void main(String[] args) {
	        String csvFilePath = "C:\\Users\\HP\\Desktop\\transactions.csv"; // Update with your CSV file path
	        Set<String> uniqueTransactions = new HashSet<>();
	        Set<String> duplicateTransactions = new HashSet<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                // Assuming each line contains a transaction as a comma-separated value
	                String[] transactionData = line.split(",");
	                if (transactionData.length > 0) {
	                    String transaction = transactionData[0]; // Adjust index as needed

						if (!uniqueTransactions.add(transaction)) {
	                        duplicateTransactions.add(transaction);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        if (duplicateTransactions.isEmpty()) {
	            System.out.println("No duplicate transactions found.");
	        } else {
	            System.out.println("Duplicate transactions found:");
	            for (String duplicate : duplicateTransactions) {
	                System.out.println(duplicate);
	            }
	        }
	    }

}
