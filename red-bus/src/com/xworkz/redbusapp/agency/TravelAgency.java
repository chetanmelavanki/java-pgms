package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.contract.RedBusContract;

public class TravelAgency {
		RedBusContract redBusContract;
		static String name="Sri Shrishial travel agency";
		
		 public TravelAgency(RedBusContract redBusContract) {
			 super();
			// TODO Auto-generated constructor stub
			 this.redBusContract=redBusContract;
		}
		
		public boolean booking(int noOfBookings) {
			boolean booking=false;
			System.out.println("inside booking()");
			boolean warrenty = redBusContract.warrenty();
			if(warrenty) {
				System.out.println("checked warrenty... Please proceed for booking");
				
						if(noOfBookings <= redBusContract.minBooking() ) {
							
							System.out.println("booking successful");
							booking= true;
						}
						
						else {
							System.out.println("Cannot proceed booking ...no of bookings exceeded");
						}
						
						System.out.println("Outside booking()");	
			}
			return booking;
		}

}
