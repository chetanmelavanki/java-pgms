package com.xworkz.collections.dto;

public class PaintDTO implements Comparable<PaintDTO>{
	private int paintId;
	private String paintName;
	
	public PaintDTO(int id,String name) {
		this.paintId=id;
		this.paintName=name;
	}

	public int getPaintId() {
		return paintId;
	}

	public void setPaintId(int paintId) {
		this.paintId = paintId;
	}

	public String getPaintName() {
		return paintName;
	}

	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}

	@Override
	public String toString() {
		return "PaintDTO [paintId=" + paintId + ", paintName=" + paintName + "]";
	}

	@Override
	public int compareTo(PaintDTO o) {
		// TODO Auto-generated method stub
		return this.paintId-o.paintId;
	}
	
	

}
