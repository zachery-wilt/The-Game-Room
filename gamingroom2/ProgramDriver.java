package com.gamingroom;

public class ProgramDriver {

	public static void main(String[] args) {
		GameService service = GameService.getGameService();

		System.out.println("\nTesting game creation...");
		Game game1 = service.addGame("Game #1");
		Game game2 = service.addGame("Game #2");
		Game gameDuplicate = service.addGame("Game #1"); // Duplicate game

		System.out.println(game1);
		System.out.println(game2);
		System.out.println(gameDuplicate); // Should match game1

		System.out.println("\nTesting team and player creation...");
		Team team1 = game1.addTeam("Team A");
		Team team2 = game1.addTeam("Team B");
		Team duplicateTeam = game1.addTeam("Team A"); // Duplicate team

		team1.addPlayer("Alice");
		team2.addPlayer("Bob");
		team2.addPlayer("Alice"); // Duplicate player test

		System.out.println(team1);
		System.out.println(team2);
		System.out.println(duplicateTeam); // Should match team1

		System.out.println("\nAbout to test the singleton...");
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
