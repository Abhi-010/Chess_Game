package com.abhi.chess_game;

public class PracticalPlayerFactory {
    public static Player getPlayer(String name,String color){
       Player player ;
       if(color.equals("White")){
           player = new Player(name,Color.WHITE);
       }
       else{
           player = new Player(name,Color.BLACK);
       }
       return player ;
    }
}
