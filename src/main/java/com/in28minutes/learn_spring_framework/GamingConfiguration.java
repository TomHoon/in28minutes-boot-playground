package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PackManGame;

public class GamingConfiguration {
	@Bean
	public GamingConsole console() {
		var game = new PackManGame();
		return game;
	}
	
	@Bean
	public GameRunner runner(GamingConsole game) {
		return new GameRunner(game);
	}
}
