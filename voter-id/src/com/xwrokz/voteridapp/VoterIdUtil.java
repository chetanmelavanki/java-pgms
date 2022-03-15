package com.xwrokz.voteridapp;

import com.xwrokz.voteridapp.dto.VoterIdDTO;

public class VoterIdUtil {
	public static void main(String[] args) {
		VoterIdDTO voter=new VoterIdDTO();
		voter.setName("anusha");
		voter.setVoterId("L2332");
		voter.setAge(22);
		
		System.out.println(voter);
		
		VoterIdDTO vote=new VoterIdDTO();
		vote.setName("anusha");
		vote.setVoterId("L2332");
		vote.setAge(22);
		
		System.out.println(vote);
		
		
		
	}

}
