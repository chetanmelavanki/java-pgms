package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.DvdDTO;

public class DvdTester {
	public static void main(String[] args) {
		Set dvd=new TreeSet();
		dvd.add(new DvdDTO(2,"pitti"));
		dvd.add(new DvdDTO(3,"gg"));
		dvd.add(new DvdDTO(10,"pavya"));
		dvd.add(new DvdDTO(1,"shrishail"));
		for (Object object : dvd) {
			System.out.println(object);
		}
	}
}
