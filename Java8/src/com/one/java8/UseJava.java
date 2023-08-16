package com.one.java8;

public class UseJava {
	
	public static void main(String[] args) {
		Functional hi=new Functional() {
			@Override
			public String Math(int a, int b, int c) {
				return ""+a+b+c;
			}
		};
	System.out.println(	hi.Math(1, 4, 67));
	
//		Functional one= (a,b,c)-> {
//			int retu=a+b+c;
//			return ""+retu;
//		};
//	System.out.println(	one.Math(12, 2, 22));
		
//		Functional two=(a)-> {
//			return ""+a;
//		};
//		System.out.println(two.get("Mouri"));
	}

	

}
