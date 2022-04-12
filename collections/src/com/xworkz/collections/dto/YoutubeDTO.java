package com.xworkz.collections.dto;

public class YoutubeDTO implements Comparable<YoutubeDTO> {
	private int id;
	private String challenName;
	
	public YoutubeDTO(int id,String name) {
		this.id=id;
		this.challenName=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChallenName() {
		return challenName;
	}

	public void setChallenName(String challenName) {
		this.challenName = challenName;
	}

	@Override
	public String toString() {
		return "YoutubeDTO [id=" + id + ", challenName=" + challenName + "]";
	}

	@Override
	public int compareTo(YoutubeDTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
}
