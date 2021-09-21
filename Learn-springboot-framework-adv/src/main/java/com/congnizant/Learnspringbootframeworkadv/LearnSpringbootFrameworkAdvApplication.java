package com.congnizant.Learnspringbootframeworkadv;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.congnizant.Learnspringbootframeworkadv.game.GameRunner;
//import com.congnizant.Learnspringbootframeworkadv.game.MarioGame;
//import com.congnizant.Learnspringbootframeworkadv.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringbootFrameworkAdvApplication {
	public static void main(String[] args) {	
		ConfigurableApplicationContext context=		
		SpringApplication.run(LearnSpringbootFrameworkAdvApplication.class, args);	
		
		//multiple component , Game Runner			
		//get bean method
		GameRunner runner = context.getBean(GameRunner.class);		
		//MarioGame game = new MarioGame();		
		//SuperContraGame game = new SuperContraGame();		
		//GameRunner runner = new GameRunner(game);		
		runner.runGame();
	}
}



