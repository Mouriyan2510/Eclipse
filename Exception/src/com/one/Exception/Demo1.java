package com.one.Exception;

public class Demo1 {
	public static void main(String [] args) {
		String a=null;
		try {
			System.out.println(a.toUpperCase());
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException ne) {
			System.out.println("Null Pointer Exception");
//			ne.printStackTrace();
		}
		catch(NumberFormatException nfe) {
			System.out.println("Nummber Format Exception");
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a);	
	}

}
