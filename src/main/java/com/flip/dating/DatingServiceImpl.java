package com.flip.dating;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.flip.dating.service.MatchCalculationService;
import com.flip.dating.service.MatchCalculationServiceImpl;

public class DatingServiceImpl implements DatingService {

	private Dating dt;

	MatchCalculationService matchCalService = new MatchCalculationServiceImpl();

	public DatingServiceImpl() {

		dt = new Dating();

	}

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.flip.dating.DatingService#adduser(java.lang.String,
	 * java.util.List, com.flip.dating.Location, java.lang.Integer)
	 * 
	 * Helps in adding the users
	 */

	public void adduser(String gender, List<String> intrests, Location loc, Integer age) {

		User newUser = new User(age, gender, intrests, loc);
		Map<Integer, List<User>> tempMatch = new TreeMap<Integer, List<User>>();
		List<User> users = dt.getUsersList();
		for (User tempUser : users) {

			Integer score = matchCalService.CalculateMatchScore(newUser, tempUser);
			Map<Integer, List<User>> oldUserMatch = tempUser.getMatches();
			List<User> tempMathcingUsers = oldUserMatch.get(score);
			if (tempMathcingUsers == null) {
				tempMathcingUsers = new ArrayList<User>();
			}
			tempMathcingUsers.add(newUser);
			oldUserMatch.put(score, tempMathcingUsers);

			// Adding the info of the new user

			List<User> tempMatchNewUser = tempMatch.get(score);
			if (tempMatchNewUser == null) {
				tempMatchNewUser = new ArrayList<User>();
			}
			tempMatchNewUser.add(tempUser);
			tempMatch.put(score, tempMatchNewUser);
		}

		users.add(newUser);

	}

	public Map<Integer, List<User>> getMatches(Integer id) {
		// TODO Auto-generated method stub

		if (dt.getUser(id) != null) {
			return dt.getUser(id).getMatches();
		}

		return null;
	}

	public User getUser(Integer id) {

		return dt.getUser(id);
	}

	public void showMatches(Integer id) {
		// TODO Auto-generated method stub
		User temp = dt.getUser(id);
		Map<Integer, List<User>> tempMavaluetches = temp.getMatches();

	}

	public void matchUser(Integer user1Id, Integer user2Id) {
		String value = new String();
		if (user1Id < user2Id) {
			value = user1Id + "," + user2Id;
		} else {
			value = user2Id + "," + user1Id;
		}

		Map<String, Pair> tempMap = dt.getPairList();
		Pair tempPair = tempMap.get(value);
		if (tempPair != null) {
			tempPair.setIsPair(true);
		} else {

			Pair temp = new Pair(dt.getUser(user1Id), dt.getUser(user2Id));

			tempMap.put(value, temp);
		}

	}

	public List<Pair> getMatchedPairs() {
		return dt.getMatchedPairs();

	}

}
