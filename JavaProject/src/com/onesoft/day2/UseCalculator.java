package com.onesoft.day2;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator calc= new Calculator();
		calc.add();
		calc.sub(30,10);
		System.out.println(calc.mul());
		System.out.println(calc.div(500, 35));
	}

}
