package practicing;

import java.util.HashMap;

public class DuplicateNum {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,4,6,1,2,3,9,10};
		
		HashMap<Integer, Integer>map=new HashMap<>();
		for(Integer g:a) {
			if(map.containsKey(g)) {
				map.put(g, map.get(g)+1);
			}
			else {
				map.put(g, 1);
			}
		}
		for(Integer y:map.keySet()) {
			int count=map.get(y);
			if(count>1) {
				System.out.println(y+"--->"+count);
			}
			else {
//				System.out.println(y+"--->"+count);
			}
		}
	}

}
