package com.xworkz.collections.dto;

public class Dream11DTO implements Comparable<Dream11DTO>{
	private int id;
	
	public Dream11DTO(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dream11DTO [id=" + id + "]";
	}

	@Override
	public int compareTo(Dream11DTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
	
}
