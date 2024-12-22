package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {

	private List<Team> teams = new ArrayList<>();

	private Game() {}

	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Team addTeam(String name) {
		for (Team currTeam : teams) {
			if (currTeam.getName().equalsIgnoreCase(name)) {
				return currTeam;
			}
		}
		GameService service = GameService.getGameService();
		Team newTeam = new Team(service.getNextTeamId(), name);
		teams.add(newTeam);
		return newTeam;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
