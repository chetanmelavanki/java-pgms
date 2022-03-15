package com.xworkz.telecommunicationapp;

import com.xworkz.telecommunicationapp.dto.TelecommunicationDTO;

public class TelecommunicationUtil {
	public static void main(String[] args) {
		
		TelecommunicationDTO tele=new TelecommunicationDTO();
		
		tele.setContactNo(23672764);
		tele.setName("shivu");
		tele.setNoOfContacts(69);
		
		TelecommunicationDTO tele1=new TelecommunicationDTO();
		
		tele1.setContactNo(2123234);
		tele1.setName("shrishail");
		tele1.setNoOfContacts(79);
		
		System.out.println(tele);
		System.out.println(tele1);
		
		System.out.println(tele1.hashCode());
		System.out.println(tele1.equals(tele));
	
		
	}

}
