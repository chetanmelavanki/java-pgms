package com.xworkz.collections.dto;

public class SwiggyDTO implements Comparable<SwiggyDTO>{
	private int id;
	private String foodName;
	
	public SwiggyDTO(int id,String name) {
		this.id=id;
		this.foodName=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return "SwiggyDTO [id=" + id + ", foodName=" + foodName + "]";
	}

	@Override
	public int compareTo(SwiggyDTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
}
