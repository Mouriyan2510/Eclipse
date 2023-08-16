package com.one.day4;

public class UseLap {
	public static void main(String[]args) {
		Lap lap1=new Lap();
		String [] a =args[0].split(",");
		lap1.brand=a[0];
		lap1.price=Integer.parseInt(a[1]);
		lap1.color=a[2];
		System.out.println(lap1.brand+" "+lap1.price+" "+lap1.color);
		Lap lap2=new Lap();
		String [] b =args[1].split(",");
		lap2.brand=b[0];
		lap2.price=Integer.parseInt(b[1]);
		lap2.color=b[2];
		System.out.println(lap2.brand+" "+lap2.price+" "+lap2.color);
		Lap lap3=new Lap();
		String [] c =args[2].split(",");
		lap3.brand=c[0];
		lap3.price=Integer.parseInt(c[1]);
		lap3.color=c[2];
		System.out.println(lap3.brand+" "+lap3.price+" "+lap3.color);
		System.out.println(lap1.brand.toUpperCase()+"\n"+lap2.brand.toUpperCase()+"\n"+lap3.brand.toUpperCase());
	}

}
