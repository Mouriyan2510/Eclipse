package com.one.Exception;

public class Demo3 {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String [] args) {
		Demo3 d=new Demo3();
	d.findA();
	}
}
