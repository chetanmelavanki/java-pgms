package com.xworkz.hospitalapp.hospital;

import java.util.Iterator;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;

public interface Hospital {
		
		
		public boolean createPatientDetails(PatientDTO dto) ;
		
		 //get all detail of patient
		public void getAllpatientDetails() ;
		
		//get only patient id
		public PatientDTO getPatientById(int patientId) ;
		
		
		//get only patient gender
		public PatientDTO getPatientByGender(Gender patientGender) ;
		
		public PatientDTO getPatientByContact(long patientContact) ;
		
		public PatientDTO getPatientByAge(int patientAge) ;
		
		public int getPatientIdByName(String patientName);
		
		public String getPatientNameById(int patientId);
		
		public String getPatientAddressByName(String patientName) ;
		
		public Gender getGenderByName(String patientName);
		
		public boolean updateContactNumByPatientName(String patientName,long contactNum) ;
		
		public boolean deletePatientDetails(String patientName) ;
}
