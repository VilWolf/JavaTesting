package com.wolf.hello.game;

public interface GamingConsole {
//Se crea clase interface para habilitar losecoupling
//Esto hace que cuando que las clases que implementen esta interface
//Compartan cualidades y sea mas facil intercambiarlas

    void up();
    void down();
    void left();
    void right();
}
