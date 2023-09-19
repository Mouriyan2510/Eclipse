package sysveda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class linkedLIST {
    public static void main(String[] args) {
    	List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,9);
    	boolean x=true;
    	boolean z=false;
    	for(Integer h:l) {
    		if(h%2==0) {
    			System.out.println(h+"  "+x);;
    		}
    		else {
    			System.out.println(h+"   "+z);
    		}
    	}
    }
}
