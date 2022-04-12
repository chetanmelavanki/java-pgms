package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.ShipDTO;

public class ShipTester {
	public static void main(String[] args) {
		Set ship=new TreeSet();
		ship.add(new ShipDTO(1, "titanic"));
		ship.add(new ShipDTO(4, "shri"));
		ship.add(new ShipDTO(3, "paddu"));
		ship.add(new ShipDTO(2, "pitti"));
		ship.add(new ShipDTO(5, "gg"));
		for (Object object : ship) {
			System.out.println(object);
		}
	}
}
