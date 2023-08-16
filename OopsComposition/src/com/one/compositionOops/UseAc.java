package com.one.compositionOops;

public class UseAc {
	public static void main(String [] args) {
		Compressor com=new Compressor();
		com.setCapacity(1000);
		com.setWarranty(3);
		Ac ac=new Ac();
		ac.setBrand("Voltus");
		ac.setColor("White");
		ac.setPrice(50000);
		ac.setCompressor(com);
		System.out.println(ac.getBrand()+" "+ac.getColor()+" "+ac.getPrice());
		System.out.println(ac.getCompressor().getCapacity()+" "+ac.getCompressor().getWarranty());
	}
}
