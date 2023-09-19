package Incedo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class mapp {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();

        // Add values to the HashMap
//        hashMap.put("Alice", 25);
//        hashMap.put("Bob", 30);
//        hashMap.put("Charlie", 28);
//        hashMap.put("David", 35);
////        for(Integer g:hashMap.values()) {
////        	System.out.println(g);
////        }
//        hashMap.forEach((a,b)-> System.out.println(a+"---"+b));
		String a="India";
		StringBuilder s=new StringBuilder(a);
		s.reverse();
		System.out.println(s);
	}

}
