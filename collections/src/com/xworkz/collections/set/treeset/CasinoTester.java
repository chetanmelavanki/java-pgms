package com.xworkz.collections.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.CasinoDTO;

public class CasinoTester {
	public static void main(String[] args) {
		Set casino=new TreeSet();
		casino.add(new CasinoDTO(1, "praveen"));
		casino.add(new CasinoDTO(3, "shree"));
		casino.add(new CasinoDTO(2, "ractor"));
		
		for (Object object : casino) {
			System.out.println(object);
		}
		
		
	}

}
