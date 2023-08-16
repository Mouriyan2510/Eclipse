package com.one.collectionarraylist;

import java.util.ArrayList;

public class UseLight {
	public static void main(String [] args) {
		String []a=args[0].split(",");
		Light l1=new Light();
		l1.brand=a[0];
		l1.price=Integer.parseInt(a[1]);
		l1.isAutomatic=Boolean.parseBoolean(a[2]);
		String []b=args[0].split(",");
		Light l2=new Light();
		l2.brand=b[0];
		l2.price=Integer.parseInt(b[1]);
		l2.isAutomatic=Boolean.parseBoolean(b[2]);
		String []c=args[0].split(",");
		Light l3=new Light();
		l3.brand=c[0];
		l3.price=Integer.parseInt(c[1]);
		l3.isAutomatic=Boolean.parseBoolean(c[2]);
		ArrayList <Light> lights=new ArrayList <Light>();
		lights.add(l1);
		lights.add(l2);
		lights.add(l3);
		for(int i=0;i<lights.size();i++) {
			lights.get(i);
		}
	System.out.println(lights.get(0));
	}

}
