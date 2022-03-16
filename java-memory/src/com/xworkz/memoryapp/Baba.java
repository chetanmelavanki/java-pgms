package com.xworkz.memoryapp;

public class Baba {
	public static void main(String[] args) {
		Baba baba=new Baba();
		baba=null;
		System.gc();
		
	}
	@Override
	public void finalize() {
		System.out.println("garbage collected");
	}
}
