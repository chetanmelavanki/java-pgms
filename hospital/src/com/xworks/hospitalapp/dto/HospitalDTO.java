package com.xworks.hospitalapp.dto;

public class HospitalDTO {
	private String patientName;
	private int patientId;
	private int bedNo;
	
	public HospitalDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getBedNo() {
		return bedNo;
	}

	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	
	public String toString() {
		return "Hospital -[patient name="+patientName+",patient id="+patientId+",bed no="+bedNo+"]";
	}

}
