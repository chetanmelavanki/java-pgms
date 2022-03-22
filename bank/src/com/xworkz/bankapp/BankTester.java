package com.xworkz.bankapp;

public class BankTester {
	public static void main(String[] args) {
		SbiBnakImpl bnakImpl=new SbiBnakImpl();
		bnakImpl.swipe();
		
		UnionBankAtmImpl atmImpl=new UnionBankAtmImpl();
		atmImpl.swipe();
		
		HdfcBankImpl bankImpl1=new HdfcBankImpl();
		bankImpl1.swipe();
	}
}
