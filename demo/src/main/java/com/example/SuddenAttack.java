package com.example;

import com.example.demo.NexonGame;

public class SuddenAttack implements NexonGame{

    @Override
    public void turnOn() {
        System.out.println("SuddenAttack is turning on");
    }
    
    @Override
    public void login() {
        System.out.println("logged in SuddenAttack");
    }
    
    @Override
    public void chat() {
        System.out.println("chatting in SuddenAttack");
    }
    
}
