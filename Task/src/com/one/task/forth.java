package com.one.task;

public class forth {
		public static void main(String[] args) {
			String a = "1+3-2";
			String[] b = a.split("[+]");
			int d = 0;
			for (String x : b) {
				String[] c = x.split("[-]");
				int e = Integer.parseInt(c[0]);
				for (int i = 1; i < c.length; i++) {
					d = d - Integer.parseInt(c[i]);
				}
				d = d + e;
			}
			System.out.println(d);
		}
	}

