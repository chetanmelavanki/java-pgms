package com.xworkz.scannerapp;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter brand");
	String brand=sc.next();
	
	System.out.println("enter size");
	int size=sc.nextInt();
	
	System.out.println("enter the colour");
	String color=sc.next();
	
	System.out.println("weight of shoes");
	double weight=sc.nextDouble();
	
	System.out.println("enter the price");
	float price=sc.nextFloat();
	
	System.out.println("enter the ratings");
	double ratingd=sc.nextDouble();
	
	System.out.println("enter departments");
	String depart=sc.next();
	
	System.out.println("enter manufactures");
	String manufacture=sc.next();
	
	System.out.println("enter item model number");
	long modelNum=sc.nextLong();
	
	System.out.println("enter packer");
	String packer=sc.next();
	
	}
}