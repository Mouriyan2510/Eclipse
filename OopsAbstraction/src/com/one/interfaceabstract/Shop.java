package com.one.interfaceabstract;

public abstract class Shop {
	abstract public String name();
	abstract public String location(String l);
	public String  shopType(String a) {
		return a;
	}
	public int  shopNo(int b) {
		return b;
	}
}
