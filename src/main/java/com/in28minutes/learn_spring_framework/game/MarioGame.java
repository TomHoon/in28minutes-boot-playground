package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Mario: up");
	}

	@Override
	public void down() {
		System.out.println("Mario: Go into hole");
	}

	@Override
	public void left() {
		System.out.println("Mario: Go Back");
	}

	@Override
	public void right() {
		System.out.println("Mario: Go Ahead");
	}
}
