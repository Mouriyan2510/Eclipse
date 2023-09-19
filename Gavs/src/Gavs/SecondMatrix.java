package Gavs;

import java.util.*;

public class SecondMatrix {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(1, 2, 3, 4));
        a.add(Arrays.asList(5, 6, 7, 8));
        a.add(Arrays.asList(1, 2, 3, 4));
        a.add(Arrays.asList(5, 6, 7, 8));
        int length=a.size();
    	int s=0;
    	for(int j=0;j<length;j++) {
    		s=s+a.get(j).get(j);
//    		s=s+a.get(j).get(length-j-1);
    	}
    	System.out.println(s);
        
//        int method=calculate(a);
//        System.out.println(method);
//    	}
//    private static int calculate(List<List<Integer>>i) {
//    	int length=i.size();
//    	int sum=0;
//    	int s=0;
//    	for(int j=0;j<length;j++) {
//    		sum=sum+i.get(j).get(j);
//    		s=s+i.get(j).get(length-j-1);
//    	}
//    	return sum;
    }
}
