package com.in28minutes.learn_spring_framework.game;

public class SuperContrGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void left() {
		System.out.println("Go Back");
	}

	@Override
	public void right() {
		System.out.println("Go Ahead");
	}
}
