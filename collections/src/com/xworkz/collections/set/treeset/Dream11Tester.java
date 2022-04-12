package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.Dream11DTO;

public class Dream11Tester {
	public static void main(String[] args) {
		Set dream=new TreeSet();
		dream.add(new Dream11DTO(1));
		dream.add(new Dream11DTO(0));
		dream.add(new Dream11DTO(2));
		dream.add(new Dream11DTO(4));
		dream.add(new Dream11DTO(3));
		for (Object object : dream) {
			System.out.println(object);
		}
	}
}
