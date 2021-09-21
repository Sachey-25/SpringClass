package com.congnizant.Learnspringbootframeworkadv.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;	
	
	public GameRunner(GamingConsole game) {
		System.out.println("Using the coder constructor");
		System.out.println("My name is Sachin");
		System.out.println("This is priting on the debug....." 
		+  "Spring framework working as background");
		this.game = game;
	}	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}