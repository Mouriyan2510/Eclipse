package com.one.compositionOops;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private Enginee enginee;
	
	public void setBrand(String brand) {
		this.brand = brand;
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
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}
	public Enginee getEnginee() {
		return enginee;
	}
	
	public Bike (String brand,int price,String color,Enginee enginee) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.enginee=enginee;
	}
	
}
