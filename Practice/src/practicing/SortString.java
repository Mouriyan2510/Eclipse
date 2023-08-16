package practicing;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String a="naveen";
		char []ch=a.toCharArray();
		Arrays.sort(ch);
		String bh=new String (ch);
		System.out.println(bh);
	}

}
