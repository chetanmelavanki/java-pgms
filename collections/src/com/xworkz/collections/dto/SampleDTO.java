package com.xworkz.collections.dto;

public class SampleDTO implements Comparable<SampleDTO>{
	private int id;

	public SampleDTO(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
	
		return id;
	}
	
	

	@Override
	public String toString() {
		return "SampleDTO [id=" + id + "]";
	}

	@Override
	public int compareTo(SampleDTO o) {
		
		return this.id-o.id;
	}
	
	
}
