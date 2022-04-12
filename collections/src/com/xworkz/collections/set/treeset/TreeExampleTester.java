package com.xworkz.collections.set.treeset ;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.SampleDTO;

public class TreeExampleTester {
	public static void main(String[] args) {
		
		Set set=new TreeSet();
		set.add(new SampleDTO(1));
		set.add(new SampleDTO(2));
		set.add(new SampleDTO(3));
		
		for (Object object : set) {
			System.out.println(object);
		}
	}

}
