package exper;

import java.util.HashMap;

public class Dupli {
	public static void main(String[] args) {
		String a="onesofttechnologies";
		char [] ch=a.toCharArray();
		
		HashMap<Character, Integer>map=new HashMap<>();
		
		for(Character w:ch) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}
			else {
				map.put(w,1);
			}
		}
		
		for(Character t:map.keySet()) {
			int count=map.get(t);
			if(count>1) {
				System.out.print(t+""+count);
			}
		}
			
	}
}
