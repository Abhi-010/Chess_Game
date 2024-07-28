package com.abhi.chess_game;

import com.abhi.chess_game.pieces.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private final Piece[][] board ;

    public Board(){
        board = new Piece[8][8] ;
        initializeBoard();
    }

    public void initializeBoard(){
        board[0][0] = new Rook(Color.WHITE,0,0);
        board[0][7] = new Rook(Color.WHITE,0,7);

        board[0][1] = new Knight(Color.WHITE,0,1) ;
        board[0][6] = new Knight(Color.WHITE,0,6) ;

        board[0][2] = new Bishop(Color.WHITE,0,2) ;
        board[0][5] = new Bishop(Color.WHITE,0,5) ;

        board[0][3] = new King(Color.WHITE,0,3);
        board[0][4] = new Queen(Color.WHITE,0,4) ;

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Color.WHITE, 1, i);
        }

        board[7][0] = new Rook(Color.BLACK, 7, 0);
        board[7][1] = new Knight(Color.BLACK, 7, 1);
        board[7][2] = new Bishop(Color.BLACK, 7, 2);
        board[7][3] = new Queen(Color.BLACK, 7, 3);
        board[7][4] = new King(Color.BLACK, 7, 4);
        board[7][5] = new Bishop(Color.BLACK, 7, 5);
        board[7][6] = new Knight(Color.BLACK, 7, 6);
        board[7][7] = new Rook(Color.BLACK, 7, 7);
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(Color.BLACK, 6, i);
        }

    }
}
