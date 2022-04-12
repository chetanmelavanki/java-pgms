package com.xworkz.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collections.dto.YoutubeDTO;

public class YoutubeTester {
	public static void main(String[] args) {
		Set you=new TreeSet();
		you.add(new YoutubeDTO(1, "codeharry"));
		you.add(new YoutubeDTO(3, "codegreeper"));
		you.add(new YoutubeDTO(2, "radiobigfm"));
		for (Object object : you) {
			System.out.println(object);
		}
	}
}
