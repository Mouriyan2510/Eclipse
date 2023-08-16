package com.one.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Try {
	public static void main(String[] args) {
		int[] a = { 123, 5677, 9907, 54, 44 };
		int d = Arrays.stream(a).min().orElse(Integer.MAX_VALUE);
		System.out.println(d);
	}

}
