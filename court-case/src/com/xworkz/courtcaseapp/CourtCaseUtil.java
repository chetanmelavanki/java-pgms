package com.xworkz.courtcaseapp;

import com.xworkz.courtcaseapp.dto.CourtCaseappDTO;

public class CourtCaseUtil {
	public static void main(String[] args) {
		CourtCaseappDTO court=new CourtCaseappDTO();
		
		court.setCaseNo(1);
		court.setClientName("praveen");
		court.setCourtName("supreme court");
		
		CourtCaseappDTO court1=new CourtCaseappDTO();
		
		court1.setCaseNo(1);
		court1.setClientName("praveen");
		court1.setCourtName("supreme court");
		
		System.out.println(court);
		System.out.println(court1);
	}

}
