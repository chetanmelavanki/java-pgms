package com.xworkz.metroapp.dto;

public class MetroDTO {
	private String metroName;
	private String location;
	private String engineType;
	
	public MetroDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getMetroName() {
		return metroName;
	}

	public void setMetroName(String metroName) {
		this.metroName = metroName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	public String toString()
	{
		return "metro - [metro name="+metroName+",metro location="+location+",engine type="+engineType+"]";
		
	}

}
