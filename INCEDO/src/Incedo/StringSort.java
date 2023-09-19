package Incedo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

public class StringSort {
	public static void main(String[] args) {
		String a[] = {"mouri","vinoliya","annadurai","thilagan"};
//		String s=a[0];
//		for(String g:a) {
//			if(g.length()>s.length()) {
//				s=g;
//			}
//		}
//		System.out.println(s);
		List<String>li=Arrays.asList(a);
		List<String>f= li.stream().sorted().collect(Collectors.toList());//sorted by first letter
		List<String>ff= li.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		System.out.println(ff);
	}

}
