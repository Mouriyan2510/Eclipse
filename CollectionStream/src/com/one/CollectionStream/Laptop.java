package com.one.CollectionStream;

public class Laptop {
	private String brand;
	private int price;
	private int ram;
	private int rom;
	private String os;
	private boolean isTouch;
	private String color;
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isTouch() {
		return isTouch;
	}
	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}
	
	public Laptop(String brand, int price, int ram, int rom, String os, boolean isTouch, String color,String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.os = os;
		this.isTouch = isTouch;
		this.color = color;
		this.model=model;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + ", rom=" + rom + ", os=" + os
				+ ", isTouch=" + isTouch + ", color=" + color + "model="+model+ "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
