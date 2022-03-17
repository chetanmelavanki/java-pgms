package com.xworkz.memoryapp;

public class StringMemory {
	public static void main(String[] args) {
		String name="baba";
		
		String name1="bAbA";
		
		String n =new String();
		//n="baba";
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		System.out.println(n==name);
		System.out.println(n.equals(name));
		
		
		//System.out.println(n.equalsIgnoreCase(name1));
	}

}
