package com.wolf.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wolf.hello.game.GameRunner;
import com.wolf.hello.game.MarioGame;
import com.wolf.hello.game.PacmanGame;
import com.wolf.hello.game.SuperContraGame;

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
