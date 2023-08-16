package com.one.day4;

public class UseMouri {
	public static void main(String[] args) {
		Mouri m=new Mouri();
		m.brand="Raja";
		m.price=1000;
		m.taxPercent=m.price*10/100;
		m.netPrice=m.price+m.taxPercent;
		System.out.println(m.netPrice);
	}

}
