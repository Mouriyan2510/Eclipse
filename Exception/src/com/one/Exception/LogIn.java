package com.one.Exception;

public class LogIn {
	public static void main(String [] args) throws LogInException {
		String userName=args[0];
		String password=args[1];
		System.out.println("Welcome");
		try {
		if(userName.equals("Mouriyan")&&password.equals("Welcome123")) {
			System.out.println(userName+" is s Authorized Person");
		}
		
		else {
			throw new LogInException("You are not Eligible");
		}
		}
		catch(LogInException le) {
			System.out.println("Run Next");			
		}
		System.out.println("ThankYou");
	}

}
