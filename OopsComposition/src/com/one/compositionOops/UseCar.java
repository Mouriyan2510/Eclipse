package com.one.compositionOops;

public class UseCar {
	public static void main(String [] args) {
		Engine e1=new Engine();
		e1.pistols=9;
		e1.price=23456;
		e1.hp=120;
		e1.type="Flat";
	Car c1=new Car();
	c1.brand="BMW";
	c1.price=120000;
	c1.color="White";
	c1.cc=2000;
	c1.engine=e1;
	System.out.println(c1.brand+" "+c1.price+" "+c1.color+" "+c1.cc);
	System.out.println(c1.engine.pistols+" "+c1.engine.price+" "+c1.engine.hp+" "+c1.engine.type);
	
	}
}
