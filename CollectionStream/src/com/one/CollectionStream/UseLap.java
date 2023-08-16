package com.one.CollectionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseLap {
	public static void main(String[] args ) {
		Laptop l1=new Laptop("Hp",60000,12,512,"windows",true,"white","fg12");
		Laptop l2=new Laptop("Asus",70000,8,212,"windows",false,"red","vdjd536");
		Laptop l3=new Laptop("Lenova",40000,8,212,"linux",true,"black","wdf366");
		Laptop l4=new Laptop("Acer",30000,4,212,"mac",false,"white","yw244");
		Laptop l5=new Laptop("Apple",90000,16,212,"mac",false,"rose","uju87");
		Laptop l6=new Laptop("Toshiba",25000,8,252,"mac",false,"silver","gyhdg76");
		Laptop l7=new Laptop("Dell",10000,12,512,"mac",false,"white","dyf76");
		Laptop l8=new Laptop("Hp",90000,16,256,"mac",false,"silver","dtf65");
		ArrayList <Laptop> laps=new ArrayList <Laptop>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		laps.add(l5);
		laps.add(l6);
		laps.add(l7);
		laps.add(l8);
		
//		List<Laptop>k=laps.stream().filter(x-> x.getColor().equalsIgnoreCase("white")).collect(Collectors.toList());
//		k.forEach(x-> System.out.println(x));
//		
//		List <String> brand=laps.stream().filter(f-> f.getPrice()>40000).map(f-> f.getBrand()).collect(Collectors.toList());
//		brand.forEach(f-> System.out.println(f));
		
		Map<String,Laptop> highprice=laps.stream().filter(f-> f.getPrice()>40000).collect(Collectors.toMap(d->d.getModel(), t-> t));
//		for(Laptop g:highprice.values()) {
//			System.out.println(g);
//		}
//		for(String g:highprice.keySet()) {
//			System.out.println(highprice);
//		}
		highprice.keySet().forEach(s-> System.out.println(highprice.get(s)));
	
	}

}
