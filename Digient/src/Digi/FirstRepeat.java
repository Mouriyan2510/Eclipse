package Digi;

import java.util.HashMap;
import java.util.Map;
 
public class FirstRepeat {
	public static void main(String[] args) {
		String a="Mouriyan 98426 !@#$%";
		String s=a.replaceAll("[^a-zA-Z\\s]", "");
		System.out.println(s);
	}
}
