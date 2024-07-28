package com.abhi.chess_game;

import com.abhi.chess_game.pieces.Piece;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayer;
    private GameStatus gameStatus;

    public Game() {
        board = new Board();
        players = new Player[2];
        currentPlayer = 0;
        gameStatus = GameStatus.IN_PROGRESS ;
    }

    public void startGame() {
        getInputPlayerDetails();
        while (this.gameStatus.equals(GameStatus.IN_PROGRESS)) {
            Player currPlayer = players[currentPlayer];
            System.out.println(currPlayer.getName() + " " + currPlayer.getColor() + "'s turn ");
            Piece piece = getMovePiece(currPlayer);
            Move move = getPlayerMove(currPlayer, piece);

            try {
                currPlayer.makeMove(board, move);
            } catch (InvalidMoveException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again!");
                continue;
            }
        }
    }

    public Move getPlayerMove(Player currPlayer, Piece piece) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination row: ");
        int destRow = scanner.nextInt();
        System.out.print("Enter destination column: ");
        int destCol = scanner.nextInt();

        //TODO : Need to check whether it is a valid destRow , destCol

        return new Move(piece, destRow, destCol);
    }

    public Piece getMovePiece(Player currPlayer) {
        System.out.println("Piece you want to move " + "Input Row and Column");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        Piece currPiece = board.getBoard()[row][col];
        if (currPiece == null || currPiece.getColor() != currPiece.getColor()) {
            throw new IllegalArgumentException("Invalid piece selection!");
        }
        return currPiece;
    }

    public void getInputPlayerDetails() {
        // take players from the console and associate with colors (Black & White)
        System.out.println("Enter First Player name : ");
        Scanner sc = new Scanner(System.in);
        String firstPlayerName = sc.next();
        System.out.println("Choose Color between White and Black");
        String color = sc.next();

        Player p1 = PracticalPlayerFactory.getPlayer(firstPlayerName, color);

        System.out.println("Enter Second Player name : ");

        String secondPlayerName = sc.next();
        System.out.println("Choose Color between White and Black");
        color = sc.next();

        Player p2 = PracticalPlayerFactory.getPlayer(firstPlayerName, color);

        if (p1.getColor().equals(Color.WHITE)) {
            players[0] = p1;
            players[1] = p2;
        } else {
            players[0] = p2;
            players[1] = p1;
        }

    }


}
