package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

public class Team extends Entity {

	private List<Player> players = new ArrayList<>();

	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player addPlayer(String name) {
		for (Player currPlayer : players) {
			if (currPlayer.getName().equalsIgnoreCase(name)) {
				return currPlayer;
			}
		}
		GameService service = GameService.getGameService();
		Player newPlayer = new Player(service.getNextPlayerId(), name);
		players.add(newPlayer);
		return newPlayer;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
