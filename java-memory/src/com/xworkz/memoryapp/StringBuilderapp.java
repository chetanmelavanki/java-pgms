package com.xworkz.memoryapp;

public class StringBuilderapp {
	public static void main(String[] args) {
		String a="Devendr ";
		System.out.println(a.hashCode());
	
		
	
		
		a=a+"singh";
		System.out.println(a.hashCode());
		
		StringBuilder builderapp=new StringBuilder("Devendr");
		System.out.println(builderapp.hashCode());
		
		builderapp=builderapp.append(builderapp);
		System.out.println(builderapp.hashCode());
	}

}
