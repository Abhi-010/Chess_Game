package com.abhi.chess_game;

import lombok.Getter;

@Getter
public class Player {
    private String name ;
    private final Color color ;
    public Player(String name, Color color){
        this.color = color ;
    }

    public void makeMove(Board board,Move move){
        //TODO :
    }
}
