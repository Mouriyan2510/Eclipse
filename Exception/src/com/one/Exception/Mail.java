package com.one.Exception;

public class Mail {
	public static void main(String [] args)throws MailException{
		String a="mouriyanav@gmail.com";
		String b="mouriyan@yahoo.in";
		System.out.println("Welcome");
		try {
		if(b.contains("@gmail.com")) {
			System.out.println("Verified");
		}
		else {
			throw new MailException("You are not allowed");
		}
		}
		catch(MailException me) {
			System.out.println("Run Next");
		}
		System.out.println("ThankYou");
	}

}
