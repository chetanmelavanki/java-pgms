package com.xworkz.memoryapp;

public class StringMethods {
	
	public static void main(String[] args) {
		String name="Devendra Singh ";
		String name1="nikunj";
		System.out.println("charcter at given position= "+name.charAt(10));
		System.out.println("unique code of the given string= "+name.hashCode());
		System.out.println("comparing the value of one string to another= "+name.equals(name1));
		System.out.println("printing the specified indes of an array= "+name.indexOf("S"));
		System.out.println("checking the given string is empty or not= "+name.isEmpty());
		System.out.println("length of the given string= "+name.length());
		System.out.println(name.replace("Singh", "King"));
		System.out.println("converting uppercase to lowercase= "+name.toLowerCase());
		System.out.println("converting lowercase to uppercase"+name.toUpperCase());
		
		char ch[]=name.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println(name.toString());
		
		System.out.println(name.valueOf(ch[5]));
		
	}

}
