package com.one.interfaceabstract;

public abstract class Bus implements Transport{
	public String brand() {
		return "Eicher";
	}
	public abstract int fare(int dis);
	public void mode() {
		System.out.println("Roadways");
	}
	public String type() {
		return "4 Wheeler";
	}
	public abstract String board();
}
