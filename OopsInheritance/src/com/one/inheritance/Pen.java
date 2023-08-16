package com.one.inheritance;

public class Pen extends StationaryProduct{
	String brand;
	String type;
	int size;
	
	public Pen(String brand,String type,int size,int price) {
		this.brand=brand;
	this.type=type;
	this.size=size;
	this.price=price;
		
}
	public String quality() {
		if(price>150) {
			return "Good Quality";
		}
		else {
			return "average";
		}
		
	}
	}
	
