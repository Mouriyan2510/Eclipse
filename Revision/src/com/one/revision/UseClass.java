package com.one.revision;

public class UseClass {
	public static void main(String[]args) {
		Ac a=new Ac();
		a.brand="Chroma";
		a.price=40000;
		a.color="White";
		a.isWarranty=true;
		a.temp=15;
		System.out.println("Brand="+(a.brand)+","+"Price="+(a.price)+","+"Color="+(a.color)+","+"Warranty="+(a.isWarranty));
		Ac b=new Ac();
		b.brand="Voltus";
		b.price=30000;
		b.color="Red";
		b.isWarranty=false;
		System.out.println("Brand="+(b.brand)+","+"Price="+(b.price)+","+"Color="+(b.color)+","+"Warranty="+(b.isWarranty));		
		Ac c=new Ac();
		c.brand="Daikin";
		c.price=50000;
		c.color="Black";
		c.isWarranty=true;
		System.out.println("Brand="+(c.brand)+","+"Price="+(c.price)+","+"Color="+(c.color)+","+"Warranty="+(c.isWarranty));
		System.out.println("Total Price="+(a.price+b.price+c.price));
		System.out.println("Average Price="+(a.price+b.price+c.price)/3);
		System.out.println(a.Decrease());
		System.out.println(a.Increase());		
		a.TurnOff();
	}

}
