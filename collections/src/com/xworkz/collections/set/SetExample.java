package com.xworkz.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.SampleDTO;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(1);
		set.add(null);
		set.add(null);
		set.add("2");
		set.add("null");
		set.add("number");
		set.add("huchha");
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		Set set1=new TreeSet();
		System.out.println();
		System.out.println("-----------TreeSet()......");
		set1.add("oyyyyyyyyyy");
		set1.add("Google");
		set1.add("1");
		set1.add("open webcam");
		
		for (Object object : set1) {
			System.out.println(object);
		}
		
		
	}

}
