package com.xwrokz.voteridapp.dto;

public class VoterIdDTO {
	private String voterId;
	private String name;
	private int age;
	
	public VoterIdDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "voter id-[voter id name="+name +", voter id="+voterId+",voter age="+age+"]";
	}

}
