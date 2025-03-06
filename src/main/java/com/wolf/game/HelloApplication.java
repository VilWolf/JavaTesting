package com.wolf.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {

		//var game = new MarioGame();
		var game = new PacmanGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

		SpringApplication.run(HelloApplication.class, args);
	}

}
