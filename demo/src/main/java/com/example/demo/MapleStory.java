package com.example.demo;

public class MapleStory implements NexonGame{

    @Override
    public void turnOn() {
        System.out.println("mapleStory is turning on");
    }
    
    @Override
    public void login() {
        System.out.println("logged in mapleStory");
    }
    
    @Override
    public void chat() {
        System.out.println("chatting in maplestory");
    }
}
