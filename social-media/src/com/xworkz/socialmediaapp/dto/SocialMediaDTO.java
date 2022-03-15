package com.xworkz.socialmediaapp.dto;

public class SocialMediaDTO {
	
	private int socialMediaId;
	private String appName;
	private String version;
	private String size;
	private String founder;
	
	public SocialMediaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getSocialMediaId() {
		return socialMediaId;
	}



	public void setSocialMediaId(int socialMediaId) {
		this.socialMediaId = socialMediaId;
	}



	public String getAppName() {
		return appName;
	}



	public void setAppName(String appName) {
		this.appName = appName;
	}



	public String getVersion() {
		return version;
	}



	public void setVersion(String version) {
		this.version = version;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public String getFounder() {
		return founder;
	}



	public void setFounder(String founder) {
		this.founder = founder;
	}



	@Override
	public String toString()
	{
		return "SocialMediaDTO - [ID="+socialMediaId+", app name="+appName+", version="+version+", size="+size+", founder="+founder+"]";
	}
}
