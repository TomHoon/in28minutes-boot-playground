package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContrGameQualifier")
public class SuperContrGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("SuperContrGame: up");
	}

	@Override
	public void down() {
		System.out.println("SuperContrGame: down");
	}

	@Override
	public void left() {
		System.out.println("SuperContrGame: Go Back");
	}

	@Override
	public void right() {
		System.out.println("SuperContrGame: Go Ahead");
	}
}
