package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.SwiggyDTO;

public class Swiggytester {
	public static void main(String[] args) {
		Set swiggy=new TreeSet();
		swiggy.add(new SwiggyDTO(1, "dhal kichadi"));
		swiggy.add(new SwiggyDTO(3, "gobi"));
		swiggy.add(new SwiggyDTO(2, "kulcha"));
		for (Object object : swiggy) {
			System.out.println(object);
		}
	}
}
