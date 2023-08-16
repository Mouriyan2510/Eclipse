package com.one.CollectionStream;

public class Car {
	private String brand;
	private int price;
	private String color;
	private float rating;
	private String model;
	private String plate;
	private String fuelType;
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Car(String brand, int price, String color, float rating, String model, String plate, String fuelType) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.rating = rating;
		this.model = model;
		this.plate = plate;
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating + ", model="
				+ model + ", plate=" + plate + ", fuelType=" + fuelType + "]";
	}

}
