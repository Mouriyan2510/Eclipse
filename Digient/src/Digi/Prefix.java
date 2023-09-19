package Digi;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
	public static void main(String[] args) {
	    String[] arr = {"apple", "applet", "applbread", "aper"};
	    String prefix = "app";
	    List<String>li=new ArrayList<>();
	    for(String f:arr) {
	    	if(f.startsWith(prefix)) {
	    		li.add(f);
	    	}
	    }
	    System.out.println(li);
	}

}
