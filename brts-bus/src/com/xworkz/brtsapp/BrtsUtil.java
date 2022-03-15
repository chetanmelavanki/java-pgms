package com.xworkz.brtsapp;

import com.xworkz.brtsapp.dto.BrtsDTO;

public class BrtsUtil {
	public static void main(String[] args) {
		BrtsDTO brts=new BrtsDTO();
		
		brts.setLocaion("hubli");
		brts.setSeatNo(1);
		brts.setTicketType("classic");
		
		System.out.println(brts);
		
		BrtsDTO brts1=new BrtsDTO();
		
		brts1.setLocaion("bglore");
		brts1.setSeatNo(2);
		brts1.setTicketType("qr");
		
		System.out.println(brts1);
		
		
		
	}

}
