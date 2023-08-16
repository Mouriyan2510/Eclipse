package com.one.compositionOops;

public class Ac {
	private String brand;
	private String color;
	private int price;
	private Compressor compressor;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCompressor(Compressor compressor) {
		this.compressor = compressor;
	}
	public Compressor getCompressor() {
		return compressor;
	}
	
}
