package com.xworkz.hospitalapp.PatientDto;

import com.xworkz.hospitalapp.constant.Gender;

public class PatientDTO {
	private int patientId;
	private String patientName;
	private String address;
	private int age;
	private String disease;
	private long contactNum;
	private Gender gender;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender string) {
		this.gender = string;
	}
	
	
	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", patientName=" + patientName + ", address=" + address + ", age="
				+ age + ", disease=" + disease + ", contactNum=" + contactNum + ", gender=" + gender + "]";
	}
	
	
	
	
}
