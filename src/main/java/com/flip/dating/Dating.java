package com.flip.dating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Dating {

	private Map<Integer, User> userList;

	private Map<String,Pair> pairList;

	public Dating() {
		userList = new TreeMap<Integer, User>();
		pairList = new HashMap<String,Pair>();
	}

	public Map<Integer, User> getUserList() {
		return userList;
	}
	
	
	public List<User> getUsersList() {
		
		List<User> tempUserList=new ArrayList<User>();
		
		for (Map.Entry<Integer, User> entry : userList.entrySet())
		{
			tempUserList.add(entry.getValue());   
		}
		return tempUserList;
	}

	public void setUserList(Map<Integer, User> userList) {
		this.userList = userList;
	}

	
	public Map<String, Pair> getPairList() {
		return pairList;
	}

	public void setPairList(Map<String, Pair> pairList) {
		this.pairList = pairList;
	}

	public User getUser(Integer id){
		
		
		return userList.get(id);
	}
	
	public List<Pair> getMatchedPairs(){
		List<Pair> tempPairList=new ArrayList<Pair>();
		
		for (Map.Entry<String, Pair> entry : pairList.entrySet())
		{
			
			Pair tempPair=entry.getValue();
			if(tempPair.getIsPair())
			tempPairList.add(entry.getValue());   
		}
		
		return tempPairList;
		
	}
}
