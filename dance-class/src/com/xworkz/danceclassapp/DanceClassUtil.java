package com.xworkz.danceclassapp;

import com.xworkz.danceclassapp.dto.DanceClassDTO;

public class DanceClassUtil {
	public static void main(String[] args) {
		DanceClassDTO dto=new DanceClassDTO();
		
		dto.setName(" dance");
		dto.setSteps(107);
		dto.setTypeDancce("classic");
		
		DanceClassDTO dto1=new DanceClassDTO();
		
		dto1.setName(" dance");
		dto1.setSteps(109);
		dto1.setTypeDancce("Lazy Dance");
		
		System.out.println(dto);
		System.out.println(dto1);
		
	}

}
