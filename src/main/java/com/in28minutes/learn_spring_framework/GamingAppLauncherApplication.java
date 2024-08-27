package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
    	var context = new AnnotationConfigApplicationContext();
    }
}
