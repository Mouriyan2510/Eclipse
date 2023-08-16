package com.one.day5Conditions;

public class Age {
	public static void main(String[]args) {
			
	int a=Integer.parseInt(args[0]);
	if(a>6&&a<12) {
		System.out.println("Kid");
				}
	else if(a>12&&a<20) {
		System.out.println("Adult");
	}
	else if(a>21&&a<30){
		System.out.println("Men");
	}
	else if(a>31&&a<40) {
		System.out.println("Legend");
	}
	else {
		System.out.println("Ultra Legend");
	}

}
}