package com.one.dayyy;

public class four {
	     static  String[] numberWords = {
	        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
	    };
	    
	     static String[] TENS = {
	            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String convertToWord(int number) {
	        if (number >= 0 && number <= 9) {
	            return numberWords[number];
	        } 
	        else if( number % 10==0) {
	            int tensDigit = number / 10;
	            return TENS[tensDigit]  ;
	        }
	        else if(number == 11) {
	        	return "Eleven";
	        }
	        else {
	        	int tensDigit = number / 10;
	        	int onesDigit=number%10;
	            return TENS[tensDigit] +  " " + numberWords[onesDigit] ;
	        	
	        }
	    }

	    public static void main(String[] args) {
	        int input = 21;
	        String output = convertToWord(input);
	        System.out.println("Output: " + output);
	    }
	}


