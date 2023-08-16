package com.one.collectionarraylist;

import java.util.ArrayList;

public class UsePlayers {
	public static void main(String [] args) {
		Players p1=new Players("Virat", 34, "Male", "India", 29000, 18);
		Players p2=new Players("Sachin", 44, "Male", "India", 38000, 10);
		Players p3=new Players("Hardik", 24, "Male", "India", 18000, 33);
		Players p4=new Players("Mithali", 32, "Female", "India", 19000, 45);
		Players p5=new Players("Smiriti", 22, "Female", "India", 9000, 11);
		Players p6=new Players("Jaiswal", 21, "Male", "India", 6000, 99);
		Players p7=new Players("Kaur", 20, "Female", "India", 8000, 87);
		ArrayList <Players> plays=new ArrayList <Players>();
		plays.add(p1);
		plays.add(p2);
		plays.add(p3);
		plays.add(p4);
		plays.add(p5);
		plays.add(p6);
		plays.add(p7);
//		for(int i=0;i<plays.size();i++) {
//			
//		if(	plays.get(i).getGender().equals("Female")) {
//			System.out.println(plays.get(i));
//		}
//		
//		}
//	for(Players a:plays) {
//		if((a).getRuns()>20000&&(a).getRuns()<40000) {
//		System.out.println(a);	
//		}
//	}
//	plays.forEach(x->System.out.println(x));
	plays.forEach(a->{
		if(a.getRuns()>25000) {
			System.out.println(a);
		}
	});
//	ArrayList <Players> female=new ArrayList <Players> ();
//	
//	for(int i=0;i<plays.size();i++) {
//		if(plays.get(i).getGender().equals("Female")) {
//			female.add(plays.get(i));
//		}
//	
//	}
////	System.out.println(female);
//	
//	ArrayList <Players> Male=new ArrayList <Players>();
////	for(Players a:Male) {
////		if(a.getGender().equals("Male")) {
////		Male.add(a);
////		}
////	}
//	for(int i=0;i<plays.size();i++) {
//		if(plays.get(i).getGender().equals("Male")) {
//			Male.add(plays.get(i));
//		}
//	
//	}
////	System.out.println(Male);
//	female.forEach(a->System.out.println(a));
//	Male.forEach(b->System.out.println(b));
	}}
