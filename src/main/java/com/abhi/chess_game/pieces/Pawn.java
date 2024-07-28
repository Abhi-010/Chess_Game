package com.abhi.chess_game.pieces;

import com.abhi.chess_game.Board;
import com.abhi.chess_game.Color;

public class Pawn extends Piece{

    public Pawn(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        int diffRow = destRow - row ;
        int diffCol = Math.abs(destCol-col);

        return ( diffRow == 1 && diffCol == 0 && board.getBoard()[destRow][destCol] == null) ||
                ( diffRow == 1 && diffCol == 1 && board.getBoard()[destRow][destCol].color != this.color) ||
                (diffRow == 2 && (row == 1 || row == 6) && diffCol == 0 && board.getBoard()[destRow][destCol] == null) ;
    }
}
