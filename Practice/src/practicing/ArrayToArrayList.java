package practicing;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,7,9,6,89};
		List<Integer>li=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			li.add(i);
		}
		System.out.println(li);
	}

}
