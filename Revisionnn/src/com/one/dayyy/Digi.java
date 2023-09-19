package com.one.dayyy;

public class Digi {
	
	public static void get(int a)throws Custom  {
		try {
		if(a<0) {
			throw new Custom("Give a valid num");
		}
		else {
			System.out.println( a+10);
		}
		}
		catch(Custom c) {
			c.printStackTrace();
		}
	}
	public static void main(String[] args)throws Custom{
	get(-1);	
	}

}
