package com.xworkz.railwaystationapp;

import com.xworkz.railwaystationapp.dto.RailwayStationDTO;

public class RailwayStationUtil {
	public static void main(String[] args) {
		RailwayStationDTO railway=new RailwayStationDTO();
		
		railway.setTrainName("golgumbaj exps");
		railway.setTrainNo("l1213");
		railway.setPlatFormNo(4);
		
		RailwayStationDTO railway1=new RailwayStationDTO();
		
		railway1.setTrainName("mysore exps");
		railway1.setTrainNo("m1223");
		railway1.setPlatFormNo(2);
		System.out.println(railway);
		System.out.println(railway1);
		
	}

}
