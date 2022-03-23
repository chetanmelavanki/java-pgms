package com.xworkz.redbusapp;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.contract.RedBusContract;
import com.xworkz.redbusapp.srs.SrsImplementation;

public class RedBusTester {
	public static void main(String[] args) {
		  RedBusContract busContract=new SrsImplementation();
		  
		  TravelAgency agency=new TravelAgency(busContract);
		  
		  agency.booking(23);
	}

}
