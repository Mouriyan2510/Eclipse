package com.one.inheritance;

public class StationaryProduct {
	String productName;
	int price;
	public int netPrice(int netPrice) {
		return price+(price*3/100);
	}

}
   