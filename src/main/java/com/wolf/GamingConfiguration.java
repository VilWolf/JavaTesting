package com.wolf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wolf.game.GameRunner;
import com.wolf.game.GamingConsole;
import com.wolf.game.PacmanGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }


}
