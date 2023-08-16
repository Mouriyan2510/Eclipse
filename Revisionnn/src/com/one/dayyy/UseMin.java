package com.one.dayyy;

public class UseMin {
	public static void main(String [] args) {
		UseMinInterface ui=new UseMinInterface();
		MinUsingInterface mi=ui::getMin;
		int[]a= {3,4,7,9,46,78};
		ui.getMin(a);
	}
}
