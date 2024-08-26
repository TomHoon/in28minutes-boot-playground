package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PackManGame;

@ComponentScan("com.in28minutes.learn_spring_framework")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        context.getBean(MarioGame.class).up();
        context.getBean(PackManGame.class).down();
    }
}
