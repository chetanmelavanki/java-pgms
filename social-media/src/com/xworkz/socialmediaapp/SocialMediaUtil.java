package com.xworkz.socialmediaapp;

import com.xworkz.socialmediaapp.dto.SocialMediaDTO;

public class SocialMediaUtil {
	public static void main(String[] args) {
		SocialMediaDTO soc=new SocialMediaDTO();
		
		soc.setAppName("wssup");
		soc.setFounder("james");
		soc.setSize("23 mb");
		soc.setSocialMediaId(4);
		soc.setVersion("15.06");
		
		SocialMediaDTO soci=new SocialMediaDTO();
		
		soci.setAppName("fac");
		soci.setFounder("kims");
		soci.setSize("32 mb");
		soci.setSocialMediaId(6);
		soci.setVersion("16.45");
		
		SocialMediaDTO socia=new SocialMediaDTO();
		
		socia.setAppName("calci");
		socia.setFounder("james");
		socia.setSize("82 mb");
		socia.setSocialMediaId(3);
		socia.setVersion("1.45 version");
		
		
		System.out.println(socia);
		
		System.out.println(soc);
		System.out.println(soci);
	}

}
