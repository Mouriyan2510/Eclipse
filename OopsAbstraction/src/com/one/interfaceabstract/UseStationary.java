package com.one.interfaceabstract;

public class UseStationary {
	public static void main(String [] args) {
		Stationary s=new Stationary();
		System.out.println(s.brand("Parker"));
		System.out.println(s.shopl("Perungudi"));
		System.out.println(s.purpose());
		System.out.println(s.sName("SKR"));
		System.out.println(s.hasWarranty(true));
	}

}
