package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.PaintDTO;

public class PaintTester {
	public static void main(String[] args) {
		Set paint=new TreeSet();
		paint.add(new PaintDTO(1,"red"));
		paint.add(new PaintDTO(4,"yellow"));
		paint.add(new PaintDTO(3,"green"));
		paint.add(new PaintDTO(2,"cyan"));
	}

}
