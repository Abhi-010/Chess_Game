package com.abhi.chess_game.pieces;


import com.abhi.chess_game.Board;
import com.abhi.chess_game.Color;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Piece {
    protected final Color color;
    protected  int row ;
    protected int col;

    public Piece(Color color){
        this.color = color ;
    }
    public Piece(Color color , int row , int col){
        this.color = color ;
        this.row = row ;
        this.col = col ;
    }
    public abstract boolean canMove(Board board, int destRow, int destCol);
}
