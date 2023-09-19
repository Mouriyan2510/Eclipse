package Volante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {
	public static void main(String[] args) {
		 String Path = "C:\\Users\\HP\\Desktop\\Vaun.txt"; // Update with your CSV file path
		 try (BufferedReader reader = new BufferedReader(new FileReader(Path))) {
	            String line;
	            int lN = 1;

	            while ((line = reader.readLine()) != null) {
	                int lL = line.length();
	                System.out.println("Line " + lN + " Length: " + lL+"   "+line);
	                lN++;
	            }
	        } 
		 catch (Exception e) { 
	            e.printStackTrace();
	        }
	        
	}

}
