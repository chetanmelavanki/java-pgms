package com.xworkz.telecommunicationapp.dto;

public class TelecommunicationDTO {
	private int contactNo;
	private String name;
	private int noOfContacts;
	
	public TelecommunicationDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfContacts() {
		return noOfContacts;
	}

	public void setNoOfContacts(int noOfContacts) {
		this.noOfContacts = noOfContacts;
	}
	
	public String toString()
	{
		return "Telecommunication-[contact no="+contactNo+",name="+name+",no of contact="+noOfContacts+"]";
	}
	
	
	@Override
	public int hashCode() {
		return this.contactNo;
	}
	@Override
	public boolean equals(Object obj) {
		TelecommunicationDTO dto=(TelecommunicationDTO)obj;
		if(this.name==dto.name)
			return true;
		return  false;
	}

}
