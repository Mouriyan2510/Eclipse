package com.onesoft.day2;
import java.util.Scanner;
public class Int {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		Double a=sc.nextDouble();
		Double b=Math.pow(a, 0.5);
		System.out.println("Square root of "+a+" is"+"\n"+ b);
	}

}
