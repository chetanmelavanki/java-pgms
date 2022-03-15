package com.xworkz.railwaystationapp.dto;

public class RailwayStationDTO {
	private int platFormNo;
	private String trainNo;
	private String trainName;
	
	public RailwayStationDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getPlatFormNo() {
		return platFormNo;
	}

	public void setPlatFormNo(int platFormNo) {
		this.platFormNo = platFormNo;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	public String toString()
	{
		return "Railway station-[name="+trainName+",platform no="+platFormNo+",train name="+trainName+"]";
		
	}

}
