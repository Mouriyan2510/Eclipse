package com.one.collectionHashMap;

import java.util.HashMap;

public class Demo {
	public static void main(String []args) {
		HashMap <Integer,String> lms=new HashMap <>();
		lms.put(1191, "Mouriyan");
		lms.put(1190, "Raju");
		lms.put(1189, "Gopal");
		lms.put(1186, "Muthu");
		lms.put(1160, "Divya");
//		System.out.println(lms.get(1191).hashCode());
//		System.out.println(lms.keySet());
//		System.out.println(lms.values());
//		System.out.println(lms);
		for(Integer a:lms.keySet()) {
			System.out.println(lms.get(a)+"  "+a);
		}
//		for(String b:lms.values()) {
//			System.out.println(b);
//		}
//		lms.keySet().forEach(c-> {
//			System.out.println(c);
//		});
//		lms.values().forEach(c-> {
//			System.out.println(c);
//		});
//		lms.forEach((x,y)-> {
//			System.out.println(x+" "+y);
//		});
//		for(Integer x:lms.keySet()) {
//			System.out.println(lms.get(x));
//		}
//	}
	}
}
