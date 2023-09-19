package Gavs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {
	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(4,4,5,3,2,6);
		int count=0;
		int[]a= li.stream().mapToInt(Integer::valueOf).toArray();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==8) {
					count=count+1;
				}
			}
		}
		System.out.println(count);
		
//		Long g= li.stream().filter(y-> y+y==8).count();
//		System.out.println(g);
	}

}
