package com.one.for2;

public class Reverss {
	public static void main(String [] args) {
	String [] names= {"Kathiravan","Naveen","VarunKumar","Muthuram"};
	for(int i=0;i<=names.length-1;i++) {
		System.out.println(names[i].charAt(names[i].length()-(1+i)));
	}

}
}
