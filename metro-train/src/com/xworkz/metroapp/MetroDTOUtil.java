package com.xworkz.metroapp;

import com.xworkz.metroapp.dto.MetroDTO;

public class MetroDTOUtil {
	public static void main(String[] args) {
		MetroDTO metro=new MetroDTO();
		
		metro.setMetroName("namm metro");
		metro.setLocation("Bangalore only");
		metro.setEngineType("electric");
		
		
		
		MetroDTO metro1=new MetroDTO();
		
		metro1.setMetroName("delhi metro");
		metro1.setLocation("delhi only");
		metro1.setEngineType("diesel");
		
		System.out.println(metro);
		System.out.println(metro1);	
		
	}

}
