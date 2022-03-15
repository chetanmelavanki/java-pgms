package com.xworkz.courtcaseapp.dto;

public class CourtCaseappDTO {
	private int caseNo;
	private String clientName;
	private String courtName;
	
	public CourtCaseappDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCourtName() {
		return courtName;
	} 

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	
	public String toString()
	{
		return "Court Case-[case no="+caseNo+",client name="+clientName+",court name="+courtName+"]";
	}
}
