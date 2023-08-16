package com.one.compositionOops;

public class Enginee {
	private int price;
	private int piston;
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPiston(int piston) {
		this.piston = piston;
	}
	public int getPiston() {
		return piston;
	}
	
	public Enginee(int price,int piston) {
		this.price=price;
		this.piston=piston;
	}

}
