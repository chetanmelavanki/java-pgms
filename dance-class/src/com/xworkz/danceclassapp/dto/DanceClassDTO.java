package com.xworkz.danceclassapp.dto;

public class DanceClassDTO {
	private String name;
	private String typeDancce;
	private int steps;
	
	public DanceClassDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeDancce() {
		return typeDancce;
	}

	public void setTypeDancce(String typeDancce) {
		this.typeDancce = typeDancce;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}
	public String toString()
	{
		return "Dance class-[name="+name+",type="+typeDancce+",steps="+steps+"]";
	}

}
