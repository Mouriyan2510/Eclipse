package com.one.CollectionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String [] args) {
		String a="Mouri";
		String b="Raju";
		String c="Kathir";
		String d="Varun";
		String e="Akash";
		String f="Priya";
		String g="Devi";
		ArrayList <String> names=new ArrayList <String> ();
		names.add(a);
		names.add(b);
		names.add(c);
		names.add(d);
		names.add(e);
		names.add(f);
		names.add(g);
//		names.stream().filter(x-> x.startsWith("P")).forEach(x-> System.out.println(x));
		List<String> k=names.stream().filter(x-> x.startsWith("M")).collect(Collectors.toList());
//		System.out.println(k);
//		k.forEach(x-> System.out.println(x));
		Long q=names.stream().filter(x-> x.startsWith("P")).count();
		System.out.println(q);
	}

}
