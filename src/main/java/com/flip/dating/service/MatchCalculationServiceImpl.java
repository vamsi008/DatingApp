package com.flip.dating.service;

import java.util.List;

import com.flip.dating.Location;
import com.flip.dating.User;

public class MatchCalculationServiceImpl implements MatchCalculationService {

	public Integer CalculateMatchScore(User user1, User user2) {

		Integer score = new Integer(0);
		if (!user1.getGender().equals(user2.getGender())) {
			score = score + 10;
		}

		Location l1 = user1.getLoc();
		Location l2 = user2.getLoc();
		score = score + getLocationScore(l1, l2);

		return score;
	}

	public Integer getLocationScore(Location l1, Location l2) {
		// TODO:
		return 0;
	}

	public Integer getIntrestCalculation(List<String> intrestes1, List<String> interests2) {

		// TODO:
		return 0;
	}

}
