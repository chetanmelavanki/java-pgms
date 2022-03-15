package com.xworkz.wrapperclassapp;

public class StringToBooleanapp {
	public static void main(String[] args) {
		String isGgHaveGF="true";
		boolean gGf=Boolean.parseBoolean(isGgHaveGF);
		System.out.println("is ganesh having gf="+gGf);
		System.out.println("  ");
		
		
		int i=10;
		Integer i1=i;//Boxing or Auto-boxing
		System.out.println("Integer toString="+i1.toString());
		System.out.println("i1 Hashcode="+i1.hashCode());
		Integer intger=100;
		int intger1=intger.intValue();//Unboxing 
		System.out.println(intger1+"\n");
		
		
		short a=15;
		Short i2=a;  //boxing
		System.out.println("short toString="+i2.toString());
		System.out.println("i2 hashcode="+i2.hashCode());
		Short shortt=90;
		short short1=shortt.shortValue();
		System.out.println(short1+"\n");
		
		
		byte b=20;
		Byte i3=b;
		System.out.println("byte toString="+i3.toString());
		System.out.println("i3 hashcode"+i3.hashCode());
		Byte bytee=12;
		byte byte1=bytee.byteValue();
		System.out.println(byte1+"\n");
	
		
		
		long c=30;
		Long i4=c;
		System.out.println("Long toSting="+i4.toString());
		System.out.println("i4 toString="+i4.hashCode());
		Long longg=11212331313l;
		long long1=longg.longValue();
		System.out.println(long1+"\n");
		
		
		double d=40.3;
		Double i5=d;
		System.out.println("Double toString"+i5.toString());
		System.out.println("i5 hashcode"+i5.hashCode());
		Double doublee=122.33;
		double double1=doublee.doubleValue();
		System.out.println(double1+"\n");
		
		
		float e=34.6f;
		Float i6=e;
		System.out.println("Float toString"+i6.toString());
		System.out.println("i6 hashcode"+i6.hashCode());
		Float z=4334.54f;
		float y=z.floatValue();
		System.out.println(y+"\n");
	
		boolean f=true;
		Boolean i7=f;
		System.out.println("Boolean toString"+i7.toString());
		System.out.println("i7 hashcode"+i7.hashCode());
		Boolean x=false;
		boolean w=x.booleanValue();
		System.out.println(w+"\n");
		
		char g='c';
		Character i8=g;
		System.out.println(i8.toString());
		System.out.println(i8.hashCode());
		Character m='A';
		char cahr1=m.charValue();
		System.out.println(cahr1);
	}

}
