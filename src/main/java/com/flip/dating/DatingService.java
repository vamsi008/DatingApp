package com.flip.dating;

import java.util.List;
import java.util.Map;

public interface DatingService {

	public void adduser(String gender, List<String> intrests, Location loc, Integer age);

	public Map<Integer, List<User>> getMatches(Integer id);

	public User getUser(Integer id);

	public void showMatches(Integer id);

	public void matchUser(Integer user1Id, Integer user2Id);

	public List<Pair> getMatchedPairs();
}
