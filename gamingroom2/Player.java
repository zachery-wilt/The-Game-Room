package com.gamingroom;

public class Player extends Entity {

	public Player(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}
