package com.onesoft.day2;

public class UseMobile {
	public static void main(String []args) {
		Mobile mobile1= new Mobile();
		mobile1.company="Oneplus";
		mobile1.price=30000;
		mobile1.color="LightBlue";
		mobile1.taxPercent=5;
		mobile1.discountPercent=3;
		mobile1.taxAmount=mobile1.price * mobile1.taxPercent/100;
		mobile1.discountAmount=mobile1.price * mobile1.discountPercent/100;
		mobile1.netPrice=mobile1.price + mobile1.taxAmount - mobile1.discountAmount;
		System.out.println("Company= "+mobile1.company+" Price= "+mobile1.price+" Color= "+mobile1.color+" NetPrice= "+mobile1.netPrice);
		Mobile mobile2= new Mobile();
		mobile2.company="Apple";
		mobile2.price=100000;
		mobile2.color="Yellow";
		mobile2.taxPercent=1;
		mobile2.discountPercent=3;
		mobile2.taxAmount=mobile2.price * mobile2.taxPercent/100;
		mobile2.discountAmount=mobile2.price * mobile2.discountPercent/100;
		mobile2.netPrice=mobile2.price + mobile2.taxAmount - mobile2.discountAmount;
		System.out.println("Company= "+mobile2.company+" Price= "+mobile2.price+" Color= "+mobile2.color+" NetPrice= "+mobile2.netPrice);
	}

}
