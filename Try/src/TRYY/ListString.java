package TRYY;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListString {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("javaaaaaaaaaaa", "python", "javjdddddddddddda");
		int b = a.get(0).length();
		String c = "";
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).length() >= b) {
				c = a.get(i);
			}
		}
		System.out.println(c);
	}

}
