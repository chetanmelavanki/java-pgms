package com.xworkz.wrapperclassapp;

public class WrapperClassapp {
	public static void main(String[] args) {
		
		//string to byte
		String tea="15";
		byte teaRs=Byte.parseByte(tea);
		System.out.println("string to byte="+teaRs);
		
		//string to short
		String total="143";
		short total1=Short.parseShort(total);
		System.out.println("string to short="+total1);
		
		//string to int
		String marks="488";
		int marks1=Integer.parseInt(marks);
		System.out.println("string to int="+marks1);
		
		//string to long
		String contactNO="9035679479";
		long contact=Long.parseLong(contactNO);
		System.out.println("string to long"+contact);
		
		//string to float
		String percentage="84.08";
		float per=Float.parseFloat(percentage);
		System.out.println("string to float"+per);
		
		//string to double
		String laptopPrice="69999.99";
		double lapPrice=Double.parseDouble(laptopPrice);
		System.out.println("string to double"+lapPrice);
		
		//string to boolean
		String isGgHaveGF="true";
		boolean gGf=Boolean.parseBoolean(isGgHaveGF);
		System.out.println("string to boolean type"+"is ganesh having gf="+gGf);
		
		
		
	}

}
