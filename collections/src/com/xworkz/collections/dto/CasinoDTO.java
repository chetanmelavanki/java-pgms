package com.xworkz.collections.dto;

public class CasinoDTO implements Comparable<CasinoDTO> {
	private int casinoId;
	private String casinoName;
	
	public CasinoDTO(int id,String name) {
		this.casinoId=id;
		this.casinoName=name;
		
	}

	public int getCasinoId() {
		return casinoId;
	}

	public void setCasinoId(int casinoId) {
		this.casinoId = casinoId;
	}

	public String getCasinoName() {
		return casinoName;
	}

	public void setCasinoName(String casinoName) {
		this.casinoName = casinoName;
	}

	@Override
	public int compareTo(CasinoDTO o) {
		// TODO Auto-generated method stub
		return this.casinoId-o.casinoId;
	}

	@Override
	public String toString() {
		return "CasinoDTO [casinoId=" + casinoId + ", casinoName=" + casinoName + "]";
	}
	
	
	
	
}
