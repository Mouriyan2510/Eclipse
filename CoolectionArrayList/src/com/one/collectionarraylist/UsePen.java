package com.one.collectionarraylist;

import java.util.ArrayList;

public class UsePen {
	public static void main(String [] args) {
		Pen p1=new Pen("PARKER",100,"Gold",3);
		Pen p2=new Pen("CAMLIN",200,"Blue",1);
		Pen p3=new Pen("NATRAJ",10,"Black",2);
		Pen p4=new Pen("REYNOLDS",15,"Blue",1);
		ArrayList <Pen> pens=new ArrayList <Pen>();
		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		pens.add(p4);
//		int temp=p1.getPrice();
		ArrayList <Pen> costly=new ArrayList <Pen>();
//		for(int i=0;i<pens.size();i++) {
//			if(pens.get(i).getPrice()>50) {
//				temp=(pens.get(i).getPrice()+(pens.get(i).getPrice()*12)/100);
//				costly.add(pens.get(i));
////				pens.get(i).setPrice(temp);
//			}
//		}
//	costly.forEach(a->System.out.println(a));	
//	for(Pen a:costly) {
//		if((a).getPrice()>50) {
//			System.out.println(a);
//		}
//	}
		Pen temp=p1;
	pens.forEach(a->{
		if(a.getManufacture()>=2) {
			temp=(a.getPrice()+(a.getPrice()*7)/100);
		}
	});
	}

}
