package com.flip.dating.service;

import java.util.List;

import com.flip.dating.Location;
import com.flip.dating.User;

public interface MatchCalculationService {
	
	
	public Integer CalculateMatchScore(User user1,User user2);
	public  Integer getLocationScore(Location l1,Location l2);
	
	public Integer getIntrestCalculation(List<String> intrestes1,List<String> interests2);

}
