package Incedo;

import java.util.Arrays;
import java.util.List;

public class one {
	public static void main(String[] args) {
//		List<Integer>li=Arrays.asList(1,2,3,34,5);
//		int h=li.stream().reduce(0,Integer::sum);
//		int a=li.stream().reduce(Integer::min).get();
//		System.out.println(a);
		
//		int a[]= {1,2,32,4,5};
//		int b=a[0];
//		for(Integer h:a) {
//			if(h>b) {
//				b=h;
//			}
//		}
//		System.out.println(b);
		
		String a[]= {"mouri","mouriyan","villas"};
		String b=a[0];
		for(String h:a){
			if(h.length()<b.length()) {
				b=h;
			}
		}
		System.out.println(b);
	}

}
