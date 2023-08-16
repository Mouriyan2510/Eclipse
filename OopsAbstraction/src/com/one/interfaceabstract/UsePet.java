package com.one.interfaceabstract;

public class UsePet {
	public static void main(String [] args) {
		PetShop ps=new PetShop();
		System.out.println(ps.name());
		System.out.println(ps.location("Medavakkam"));
		System.out.println(ps.shopType("Pet"));
		System.out.println(ps.shopNo(8));
	}

}
