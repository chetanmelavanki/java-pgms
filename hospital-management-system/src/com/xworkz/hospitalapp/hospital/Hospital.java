package com.xworkz.hospitalapp.hospital;

import java.util.Iterator;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;

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
					System.out.println("patient id :"+patientDTO[i].getPatientId()+" is available");
				}
				else {
					System.out.println("patient id :"+patientDTO[i].getPatientId()+" is not available");
				}
			}
			return patientId;
		}
		
		public String getPatientIdByName(String patientName) {
			System.out.println("inside getPatientIdByName()..");
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println("patient name:"+patientDTO[i].getPatientName() + "," + "patient ID:"+patientDTO[i].getPatientId());
				}
				else {
						System.out.println("patient id :"+patientDTO[i].getPatientId()+" is not available");
				}
			}
			return patientName;
		}
		
		
		
}
