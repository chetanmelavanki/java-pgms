package com.xworkz.brtsapp.dto;

public class BrtsDTO {
	private String locaion;
	private int seatNo;
	private String ticketType;
	
	public BrtsDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getLocaion() {
		return locaion;
	}

	public void setLocaion(String locaion) {
		this.locaion = locaion;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	public String toString()
	{
		return "BRTS-[location="+locaion+",seat no="+seatNo+",ticket type="+ticketType+"]";
	}

}
