package com.xworkz.hospitalapp.hospital.impl;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalImpl implements Hospital {
	//One - Many bcz in array we can add more elements
			public PatientDTO patientDTO[];
			int index;
			
			
			//constructor
			public HospitalImpl(int size) {
				patientDTO = new PatientDTO[size];
			}
			

	@Override
	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("Invoked createPatientDetails()");
		boolean patientAdded=false;
		try {
		if(dto != null) {
			patientDTO[index++]=dto;
			patientAdded=true;
		}
		else {
			System.out.println("No patient found");
		}
		System.out.println("end of createPatientDetails()");
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patientAdded;
	
	}
	
	
	@Override
	public void getAllpatientDetails() {
		try {
		System.out.println("inside getAllpatientDetails ()...fetching the data");
		for (int i = 0; i < patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
		}
		System.out.println("end of getpatientDetails");
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		
	}

	@Override
	public PatientDTO getPatientById(int patientId) {
		PatientDTO patient=null;
		try {
		System.out.println("inside getPatientId()");
		for(int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientId()==patientId) {
				patient=patientDTO[i];
				System.out.println(patient);
			}
			else {
				System.out.println("patient id :"+patientId +" is not available");
			}
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
		
	}
	@Override
	public PatientDTO getPatientByGender(Gender patientGender) {
		PatientDTO patient=null;
		try {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getGender()==patientGender) {
				patient=patientDTO[i];
				System.out.println(patient);
			}
			else {
				System.out.println("patient gender :" + patientGender+" is not available");
			}
		}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
	}
	

	@Override
	public PatientDTO getPatientByContact(long patientContact) {
		PatientDTO patient=null;
		try {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getContactNum()==patientContact) {
				patient=patientDTO[i];
				System.out.println(patient);
			}
			else {
				System.out.println("patient id  is not available");
			}
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
	
	}
	@Override
	public PatientDTO getPatientByAge(int patientAge) {
		PatientDTO patient=null;
		try {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getAge()==patientAge) {
				patient=patientDTO[i];
				System.out.println(patient);
			}
			else {
				System.out.println("patient  :" + patientAge+" is not available");
			}
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
	}
	
	@Override
	public int getPatientIdByName(String patientName)  {
		System.out.println("inside getPatientIdByName()..");
		int patientId=0;
		try {
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientName().equals(patientName)) {
				patientId=patientDTO[i].getPatientId();
				System.out.println(patientDTO[i].getPatientId());
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patientId;
		
	}

	@Override
	public String getPatientNameById(int patientId) {
		String patientName= null ;
		System.out.println("inside getPatientIdByName()..");
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientId()==patientId) {
				patientName=patientDTO[i].getPatientName();
				System.out.println(patientDTO[i].getPatientName());
			}
			else {
					System.out.println("patient id is not available");
			}
		}
	}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patientName;
	}
	

	@Override
	public String getPatientAddressByName(String patientName) {
		System.out.println("inside getPatientIdByName()..");
		String patientAddress=null;
		try {
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientName().equals(patientName)) {
				patientAddress=patientDTO[i].getAddress();
				System.out.println(patientDTO[i].getAddress());
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patientName;
	}

	@Override
	public Gender getGenderByName(String patientName)  {
		System.out.println("inside getPatientIdByName()..");
		Gender gender=null;
		try {
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientName().equals(patientName)) {
				gender=patientDTO[i].getGender();
				System.out.println(patientDTO[i].getGender());
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return gender;
	}
	
	@Override
	public boolean updateContactNumByPatientName(String patientName, long contactNum) {
		
		System.out.println("inside updateContactNumByPatientName()..");
		boolean isContactNumUpdated=false;
		try {
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientName().equals(patientName)) {
				patientDTO[i].setContactNum(contactNum);
				isContactNumUpdated=true;
				System.out.println("updated num:"+contactNum);
				}
			else {
				System.out.println(patientDTO[i].getContactNum()+" num is not updated");
			}
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return isContactNumUpdated;
		
	}

	@Override
	public boolean deletePatientDetails(String patientName) { 
		boolean delete = false;
		try {
			for (int i = 0; i < patientDTO.length; i++) {
				if (patientDTO[i].getPatientName().equals(patientName)) { 
					patientDTO[i] = null; 
					System.out.println("Patient details are deleted"); 
					return true;
		}
		else {
			System.out.println("Patient Details dint deleted");
			}

		}
	}
		catch (NullPointerException n) {

		System.out.println("NullPointerException"); 
		n.fillInStackTrace();

		}

		return delete;
		
		
		
	}

}
