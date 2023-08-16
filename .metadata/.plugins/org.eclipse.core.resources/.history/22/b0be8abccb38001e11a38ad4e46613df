package com.one.day1;

public class FinalizeSample {
	
	@Override
	public void finalize() {
		System.out.println("Garbage Collector");
	}
	
	public static void main(String [] args) {
		FinalizeSample fs=new FinalizeSample();
		System.out.println(fs.hashCode());
		
		 fs=new FinalizeSample();
		 System.gc();
		System.out.println(fs.hashCode());
		
	}

}
