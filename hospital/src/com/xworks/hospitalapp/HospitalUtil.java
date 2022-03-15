package com.xworks.hospitalapp;

import com.xworks.hospitalapp.dto.HospitalDTO;

public class HospitalUtil {
	public static void main(String[] args) {
		HospitalDTO hospital=new HospitalDTO();
		
		hospital.setPatientName("ganesg (gg)");
		hospital.setPatientId(1);
		hospital.setBedNo(5);
		System.out.println(hospital);
		
		HospitalDTO hospital1=new HospitalDTO();
		
		hospital1.setPatientName("pradeep");
		hospital1.setPatientId(2);
		hospital1.setBedNo(6);
		System.out.println(hospital1);
	}

}
