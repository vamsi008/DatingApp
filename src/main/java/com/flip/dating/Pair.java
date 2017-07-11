package com.flip.dating;

public class Pair {

	private String id;
	private User user1;
	private User user2;

	Boolean isPair = false;

	public Pair(User user1, User user2) {
		this.user1 = user1;
		this.user2 = user2;
		id = user1.getId() + "," + user2.getId();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public Boolean getIsPair() {
		return isPair;
	}

	public void setIsPair(Boolean isPair) {
		this.isPair = isPair;
	}

}
