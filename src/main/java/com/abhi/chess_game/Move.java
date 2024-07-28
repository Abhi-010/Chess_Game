package com.abhi.chess_game;

import com.abhi.chess_game.pieces.Piece;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Move {
    private final Piece piece ;
    private final int destRow ;
    private final int destCol ;

    public Move(Piece piece , int destRow, int destCol){
        this.piece = piece ;
        this.destRow = destRow ;
        this.destCol = destCol ;
    }

}
