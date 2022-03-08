package com.xworkz.aadharapp;

import com.xworkz.aadharapp.dto.AadharDTO;

public class AadharUtil {
	public static void main(String[] args) {
		AadharDTO aadhar=new AadharDTO();
		
		aadhar.setUidId(126376464623l);
		aadhar.setUidname("chetan");
		aadhar.setAdress("bgk");
		
		AadharDTO aadha=new AadharDTO();
		
		aadha.setUidId(46464464623l);
		aadha.setUidname("ganesh");
		aadha.setAdress("guledgudda");
		
		System.out.println(aadha);
		System.out.println(aadha);
	}

}
