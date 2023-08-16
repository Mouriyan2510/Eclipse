package com.one.Exception;

public class Demo2 {
	public static void main(String [] args) {
		String a="TN21AP9462";
		try {
		int b=Integer.parseInt(a);
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException ne) {
			System.out.println("Null Pointer Exception");
		}
//		catch(NumberFormatException nfe) {
//			System.out.println("Number Format Exception");
//		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println("	Arithmetic Exception");
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally {
			System.out.println("Run remaining");
		}
		System.out.println(a);
		}
}
