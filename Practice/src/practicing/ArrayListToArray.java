package practicing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(112,45,7,990,567);
		Collections.reverse(li);
		Integer[]in=li.toArray(new Integer [li.size()]);
//		Object[]in=li.toArray();
		Arrays.sort(in);//asc
		Arrays.sort(in, Comparator.reverseOrder());
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
	}

}
