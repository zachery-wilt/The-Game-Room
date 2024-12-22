package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

public class GameService {

	private static List<Game> games = new ArrayList<>();
	private static long nextGameId = 1;
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;
	private static GameService service = null;

	private GameService() {}

	public static GameService getGameService() {
		if (service == null) {
			service = new GameService();
		}
		return service;
	}

	public Game addGame(String name) {
		for (Game game : games) {
			if (game.getName().equalsIgnoreCase(name)) {
				return game;
			}
		}
		Game newGame = new Game(nextGameId++, name);
		games.add(newGame);
		return newGame;
	}

	public Game getGame(int index) {
		return games.get(index);
	}

	public long getNextTeamId() {
		return nextTeamId++;
	}

	public long getNextPlayerId() {
		return nextPlayerId++;
	}

	public int getGameCount() {
		return games.size();
	}
}
