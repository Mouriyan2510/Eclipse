package com.one.for2;

public class Even {
	public static void main(String [] args) {
		String [] a=args[0].split(",");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(a[2]);
		int e=Integer.parseInt(a[3]);
		int values[]= {b,c,d,e};
		int f=b;;
		int o=0;
		int z=1;
		for(int i=0;i<values.length;i++) {
			if(values[i]>f) {
				o=values[i];
			}
		}
		for(int j=1;j<=o;j++) {
			z=z*j;
		}
		System.out.println(o);
		System.out.println(z);
	}
}