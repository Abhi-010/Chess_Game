package com.abhi.chess_game.pieces;

import com.abhi.chess_game.Board;
import com.abhi.chess_game.Color;

public class Queen extends Piece{

    public Queen(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        int rowDiff = Math.abs(destRow - row);
        int colDiff = Math.abs(destCol - col);
        return (rowDiff == colDiff) || (row == destRow || col == destCol);
    }
}
