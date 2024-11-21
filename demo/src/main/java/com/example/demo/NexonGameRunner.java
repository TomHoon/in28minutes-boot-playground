package com.example.demo;

public class NexonGameRunner {

    private NexonGame nexonGame;

    public NexonGameRunner(NexonGame nexonGame) {
        this.nexonGame = nexonGame;
    }

    public void run() {
        this.nexonGame.turnOn();
        this.nexonGame.login();
        this.nexonGame.turnOn();
    }
}
