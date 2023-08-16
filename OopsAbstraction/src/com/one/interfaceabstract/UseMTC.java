package com.one.interfaceabstract;

public class UseMTC {
	public static void main(String [] args) {
		MTC m=new MTC();
	System.out.println(m.brand());
	m.mode();
	System.out.println(m.type());
	System.out.println(m.fare(650));
	System.out.println(m.board());
	System.out.println(m.timing(650));
	}

}
