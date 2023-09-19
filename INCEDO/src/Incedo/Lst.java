package Incedo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lst {
	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(1,2,3,4,5,6,7);
		int i= li.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(i);
	}
}
