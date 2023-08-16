package com.one.collectionarraylist;

public class Pen {
	private String brand;
	private int price;
	private String color;
	private int manufacture;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getManufacture() {
		return manufacture;
	}
	public void setManufacture(int manufacture) {
		this.manufacture = manufacture;
	}
	
	public Pen(String brand,int price,String color,int manufacture) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.manufacture=manufacture;
	}
	
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", COLOR= "+color+", MANUFACTURE= "+manufacture;
	}
}
