package com.xworkz.collections.dto;

public class DvdDTO implements Comparable<DvdDTO>{
	private int dvdId;
	private String name;
	
	public DvdDTO(int id,String name) {
		this.dvdId=id;
		this.name=name;
	}
	

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(DvdDTO o) {
		// TODO Auto-generated method stub
		return this.dvdId-o.dvdId;
	}

	@Override
	public String toString() {
		return "DvdDTO [dvdId=" + dvdId + ", name=" + name + "]";
	}
	
	
}
