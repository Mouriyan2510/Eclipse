package Gavs;

import java.util.HashMap;
import java.util.Map;

public class FourMap {
	public static void main(String[] args) {
	
	Map<Integer, String> h = new HashMap<>();
    h.put(3, "Apple");
    h.put(5, "watermelon");
    h.put(10, "orange");
    
    for(Integer i:h.keySet()) {
    	System.out.println(i+"-"+h.get(i));
    }

	}
}
