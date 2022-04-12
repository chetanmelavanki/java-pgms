package com.xworkz.collections.dto;

public class ShipDTO implements Comparable<ShipDTO>{
	private int shipId;
	private String shipName;
	
	public ShipDTO(int id,String name) {
		this.shipId=id;
		this.shipName=name;
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Override
	public String toString() {
		return "ShipDTO [shipId=" + shipId + ", shipName=" + shipName + "]";
	}

	@Override
	public int compareTo(ShipDTO o) {
		// TODO Auto-generated method stub
		return this.shipId-o.shipId;
	}
	
	

}
