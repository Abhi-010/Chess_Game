package com.abhi.chess_game.pieces;

import com.abhi.chess_game.Board;
import com.abhi.chess_game.Color;

public class Knight extends Piece {
    public Knight(Color color){
        super(color);
    }
    public Knight(Color color,int row, int col){
        super(color, row, col);
    }
    @Override
    public boolean canMove(Board board, int destRow, int destCol) {

        int diffRow = Math.abs(destRow-row);
        int diffCol = Math.abs(destCol-col);

        return (diffRow == 2 && diffCol == 1 && (board.getBoard()[destRow][diffCol] == null ||
                board.getBoard()[destRow][diffCol].getColor() != this.color) ||
                diffCol == 2 && diffRow == 1 && (board.getBoard()[destRow][diffCol] == null ||
                        board.getBoard()[destRow][diffCol].getColor() != this.color)
                );
    }
}
