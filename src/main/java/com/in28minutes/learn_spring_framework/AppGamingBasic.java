package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PackManGame;
import com.in28minutes.learn_spring_framework.game.SuperContrGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var superContraGame = new SuperContrGame();
		var packManGame = new PackManGame();
		
		var gameRunner1 = new GameRunner(superContraGame);
		var gameRunner2 = new GameRunner(marioGame);
		var gameRunner3 = new GameRunner(packManGame);
		
		gameRunner1.run();
		gameRunner2.run();
		gameRunner3.run();
		// 
	}
}

