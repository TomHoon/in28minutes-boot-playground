package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		// var game = new MapleStory();
		var game = new MapleStory();

		var nexonGameRunner = new NexonGameRunner(game);

		nexonGameRunner.run();
	}

}
