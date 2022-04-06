package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.PatientDto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.impl.HospitalImpl;

public class HospitalTester {
	private static final Gender male = null;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scanner.nextInt();
		
//		int size=scanner.nextInt();
//		or
		
		Hospital hospital=new HospitalImpl(size);
		
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
	String text=null;
	do {
		System.out.println("Enter 1 to get all the patient details");
		System.out.println("Enter 2 to get patient details by patient id");
		System.out.println("Enter 3 to get patient details by patient gender");
		System.out.println("Enter 4 to get patient details by patient contact");
		System.out.println("Enter 5 to get patient details by patient age");
		System.out.println("Enter 6 to get patient id by patient name");
		System.out.println("Enter 7 to get patient name by patient id");
		System.out.println("Enter 8 to get patient gender by patient name");
		System.out.println("Enter 9 to update patient contact no by patient name");
		System.out.println("Enter 10 to delete patient details by patient name");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:System.out.println("getting all patient details");
			hospital.getAllpatientDetails();
			break;
		case 2:System.out.println("enter patient id to get patient details");
			hospital.getPatientById(scanner.nextInt());
			break;
		case 3:	System.out.println("enter patient gender to get patient details");
			String gender1=scanner.next(); 
			hospital.getPatientByGender(Gender.valueOf(gender1));
			break;
		case 4: System.out.println("enter patient contact num to get patient details");
			hospital.getPatientByContact(scanner.nextLong());
			break;
		case 5:System.out.println("enter patient age to get patient details");
			hospital.getPatientByAge(scanner.nextInt());
			break;
		case 6:System.out.println("enter patient name to get patient id");
			hospital.getPatientIdByName(scanner.next());
			break;
		case 7:System.out.println("enter patient id to get patient name");
			hospital.getPatientNameById(scanner.nextInt());
			break;
		case 8:System.out.println("enter patient name to get patient gender");
			hospital.getGenderByName(scanner.next());
			break;
		case 9:System.out.println("update patient contact num by enter patient name and patient contact num");
			hospital.updateContactNumByPatientName(scanner.next(), scanner.nextLong());
			break;
		case 10:System.out.println("delete patient details by entering patient name");
			hospital.deletePatientDetails(scanner.next());
			break;
		default:System.out.println("enter a correct choice");
		}
		System.out.println("do you want to continue type yes / no");
		text=scanner.next();
		
	}
	while(text.equalsIgnoreCase("yes"));
		
		/*
		 * //accesing all details System.out.println(); hospital.getAllpatientDetails();
		 * 
		 * System.out.println();
		 * 
		 * //access only id System.out.println("serach for available ID");
		 * hospital.getPatientById(scanner.nextInt());
		 * 
		 * 
		 * 
		 * System.out.println();
		 * 
		 * //access only gender System.out.println("search for Patient gender"); String
		 * gender1=scanner.next(); hospital.getPatientByGender(Gender.valueOf(gender1));
		 * 
		 * System.out.println();
		 * 
		 * //acces only contact System.out.println("search for contact number");
		 * hospital.getPatientByContact(scanner.nextLong());
		 * 
		 * System.out.println();
		 * 
		 * //access only age System.out.println("search for age");
		 * hospital.getPatientByAge(scanner.nextInt());
		 * 
		 * System.out.println();
		 * 
		 * //access only patient id by name System.out.println("search for ID by Name");
		 * hospital.getPatientIdByName(scanner.next());
		 * 
		 * //access patient name by patient id
		 * System.out.println("search for patient name by id");
		 * hospital.getPatientNameById(scanner.nextInt());
		 * 
		 * //access patient address by patient name System.out.println();
		 * System.out.println("search for patient address by name");
		 * hospital.getPatientAddressByName(scanner.next());
		 * 
		 * //access patient gender by patient name System.out.println();
		 * System.out.println("search for patient gender by name");
		 * hospital.getGenderByName(scanner.next());
		 * 
		 * //updatng patient num by patient name System.out.println();
		 * System.out.println( "updating contact num by patient name");
		 * hospital.updateContactNumByPatientName(scanner.next(),scanner.nextLong());
		 * 
		 * System.out.println(); System.out.println("deleting a patient detaails");
		 * hospital.deletePatientDetails(scanner.next());
		 */
	scanner.close();
	}
	
}
