package com.xworkz.hospitalapp.hospital;

import java.util.Iterator;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;

public class Hospital {
		//One - Many bcz in array we can add more elements
		public PatientDTO patientDTO[];
		int index;
		
		
		//constructor
		public Hospital(int size) {
			patientDTO = new PatientDTO[size];
		}
		
		public boolean createPatientDetails(PatientDTO dto) {
			System.out.println("Invoked createPatientDetails()");
			boolean patientAdded=false;
			if(dto != null) {
				patientDTO[index++]=dto;
				patientAdded=true;
			}
			else {
				System.out.println("No patient found");
			}
			System.out.println("end of createPatientDetails()");
			return patientAdded;
		
		}
		
		 
		public void getAllpatientDetails() {
			System.out.println("inside getAllpatientDetails ()...fetching the data");
			for (int i = 0; i < patientDTO.length; i++) {
				System.out.println(patientDTO[i]);
			}
			System.out.println("end of getpatientDetails");
			
		}
		
		public int getPatientId(int patientId) {
			System.out.println("inside getPatientId()");
			for(int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientId()==patientId) {
					System.out.println("patient id :"+patientDTO[i].getPatientId());
				}
				else {
					System.out.println("patient id :"+patientId +" is not available");
				}
			}
			return patientId;
		}
		
		
		
		public Gender getPatientGender(Gender patientGender) {
			System.out.println("inside getPatientByGender()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getGender()==patientGender) {
					System.out.println("patient gender : " + patientDTO[i].getGender());
				}
				else {
					System.out.println("patient gender :" + patientGender+" is not available");
				}
			}
			return patientGender;
		}
		
		public long getPatientContact(long patientContact) {
			System.out.println("inside getPatientByGender()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getContactNum()==patientContact) {
					System.out.println("patient gender : " + patientDTO[i].getContactNum());
				}
				else {
					System.out.println("patient gender :" + patientContact+" is not available");
				}
			}
			return patientContact;
		}
		public int getPatientAge(int patientAge) {
			System.out.println("inside getPatientByGender()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getContactNum()==patientAge) {
					System.out.println("patient gender : " + patientDTO[i].getAge());
				}
				else {
					System.out.println("patient gender :" + patientAge+" is not available");
				}
			}
			return patientAge;
		}
		
		public String getPatientIdByName(String patientName) {
			System.out.println("inside getPatientIdByName()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println("patient name:"+patientDTO[i].getPatientName() + "," + "patient ID:"+patientDTO[i].getPatientId());
				}
				else {
						System.out.println("patient id :"+patientName+" is not available");
				}
			}
			return patientName;
		}
		
		public int getPatientNameById(int patientId) {
			System.out.println("inside getPatientIdByName()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientId()==patientId) {
					System.out.println("patient id:"+patientDTO[i].getPatientId() + "," + "patient name:"+patientDTO[i].getPatientName());
				}
				else {
						System.out.println("patient id :"+patientId+" is not available");
				}
			}
			return patientId;
		}
		
		public String getPatientAddressByName(String patientName) {
			System.out.println("inside getPatientIdByName()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println("patient name:"+patientDTO[i].getPatientName()+ "," +"patient address:"+patientDTO[i].getAddress() );
				}
				else {
						System.out.println("patient id :"+patientName+" is not available");
				}
			}
			return patientName;
		}
		
		public String getGenderByName(String patientName) {
			System.out.println("inside getPatientIdByName()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println("patient name:"+patientDTO[i].getPatientName()+ "," +"patient address:"+patientDTO[i].getGender() );
				}
				else {
						System.out.println("patient id :"+patientName+" is not available");
				}
			}
			return patientName;
		}
		
		
}
