package com.onesoft.day2;
import java.util.Scanner;

public class UseObjectUsingRuntime {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		ObjectUsingRuntime obj=new ObjectUsingRuntime();
		System.out.println("Enter Company Name");
		obj.company= sc.nextLine();
		System.out.println("Enter Color");
		obj.color= sc.nextLine();
		System.out.println("Enter the Price");
		obj.price= sc.nextInt();
		System.out.println("Enter the TaxAmount");
		obj.taxAmount=sc.nextInt();
		System.out.println("Enter the DiscountAmount");
		obj.discountAmount=sc.nextInt();
		obj.netPrice= obj.price+obj.taxAmount-obj.discountAmount;
		System.out.println("Company= "+obj.company+"\nColor= "+obj.color+"\nNetPrice= "+obj.netPrice);
		
	}

}
