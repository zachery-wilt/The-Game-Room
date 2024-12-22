package com.gamingroom;

public class SingletonTester {

	public void testSingleton() {
		GameService service = GameService.getGameService();

		System.out.println("\nAbout to test the singleton...");
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}
	}
}
