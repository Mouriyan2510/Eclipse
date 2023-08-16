package com.onesoft.day2;
import java.util.Scanner;
public class Details {
	public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name= sc.nextLine();
	System.out.println("Enter Your Age");
	int age= sc.nextInt();
	System.out.println("Enter Your Phone Number");
	long phone= sc.nextLong();
	System.out.println("Enter Your CGPA");
	float cgpa= sc.nextFloat();
}
}