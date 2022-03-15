package com.xworkz.atmcardapp.dto;

public class AtmCardDTO {
	private int atmCardNo;
	private String atmName;
	private int cvNo;
	
	public AtmCardDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getAtmCardNo() {
		return atmCardNo;
	}

	public void setAtmCardNo(int atmCardNo) {
		this.atmCardNo = atmCardNo;
	}

	public String getAtmName() {
		return atmName;
	}

	public void setAtmName(String atmName) {
		this.atmName = atmName;
	}

	public int getCvNo() {
		return cvNo;
	}

	public void setCvNo(int cvNo) {
		this.cvNo = cvNo;
	}
	
	public String toString()
	{
		return "ATM CARD-[Atm Card NO="+atmCardNo+",atm card name="+atmName+",atm cv no="+cvNo+"]";
	}

}
