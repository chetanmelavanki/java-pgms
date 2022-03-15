package com.xworkz.atmcardapp;

import com.xworkz.atmcardapp.dto.AtmCardDTO;

public class AtmCardUtil {
	public static void main(String[] args) {
		AtmCardDTO atm=new AtmCardDTO();
		
		atm.setAtmCardNo(122652651);
		atm.setAtmName("rupay");
		atm.setCvNo(867);
		
		
		
		AtmCardDTO atm1=new AtmCardDTO();
		
		atm1.setAtmCardNo(122652651);
		atm1.setAtmName("rupay");
		atm1.setCvNo(867);
		
		System.out.println(atm);
		System.out.println(atm1);
	}

}
