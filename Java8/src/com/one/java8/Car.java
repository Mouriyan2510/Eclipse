package com.one.java8;

public class Car {
	public String brand;
	private int price;
	private String color;
	private int rating;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Car(String brand,int price, String color, int rating) {
		super();
		this.brand=brand;
		this.price = price;
		this.color = color;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating + "]";
	}
	
	

}
