package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	private static final Gender male = null;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scanner.nextInt();
		
//		int size=scanner.nextInt();
//		or
		
		Hospital hospital=new Hospital(size);
		
	for(int i=0;i<size;i++) {
		
		PatientDTO dto=new PatientDTO();
		
		System.out.println("enter a patient id");
		dto.setPatientId(scanner.nextInt());
		
		System.out.println("enter a name ");
		dto.setPatientName(scanner.next());
		
		System.out.println("enter a adress");
		dto.setAddress(scanner.next());
		
		System.out.println("enter a age");
		dto.setAge(scanner.nextInt());
		
		System.out.println("enetr a disease");
		dto.setDisease(scanner.next());
		
		System.out.println("enter a number");
		dto.setContactNum(scanner.nextLong());
		
		System.out.println("enter a gender");
		String gender = scanner.next();
		dto.setGender(Gender.valueOf(gender));
			
		System.out.println(hospital.createPatientDetails(dto));
		
		}
	//accesing all details
	System.out.println();
	hospital.getAllpatientDetails();
	
	System.out.println();
	
	//access only id
	System.out.println("serach for available ID");
	hospital.getPatientId(scanner.nextInt());
	
	System.out.println();
	
	//access only patient id by name
	System.out.println("search for ID by Name");
	hospital.getPatientIdByName(scanner.next());
	


	}
	
}
