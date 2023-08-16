package practicing;

import java.util.HashMap;

public class DublicateChar {
	public static void main(String[] args) {
		String chara="onesofttechnologies";
		char ch[]=chara.toCharArray();
		
		HashMap<Character, Integer> mmm=new HashMap<>();
		for(Character f:ch) {
			if(mmm.containsKey(f)) {
				mmm.put(f, mmm.get(f)+1);
			}
			else {
				mmm.put(f, 1);
			}
		}
		
		for(Character y:mmm.keySet()) {
			int count=mmm.get(y);
			if(count>1) {
				System.out.println(y+"---"+count);
			}
		}
		
	}
	}


