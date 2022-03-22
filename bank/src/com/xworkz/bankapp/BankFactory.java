package com.xworkz.bankapp;

public class BankFactory {
	public static Atm getBank(String type) {
		if(type.equalsIgnoreCase("Sbibank")) {
			return new SbiBnakImpl();
		}
		else if (type.equalsIgnoreCase("Unionbank")) {
			return new UnionBankAtmImpl();
		}
		else if(type.equalsIgnoreCase("hdfcbank")) {
			return new HdfcBankImpl();
		}
		else {
			System.out.println("invalind atm card");
		}
		return null;
		
	}

}
