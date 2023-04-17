package com.company;

import javax.swing.text.Position;

public class Main {

    public static void main(String[] args) {

        int Position =  calculateHighScorePosition(1500);
        displayHighScorePosition( "Rohit", Position);

        Position =  calculateHighScorePosition(900);
        displayHighScorePosition( "Alex", Position);

        Position =  calculateHighScorePosition(400);
        displayHighScorePosition( "Ricky", Position);

        Position =  calculateHighScorePosition(50);
        displayHighScorePosition( "Tom", Position);

    }

    public static void displayHighScorePosition(String PlayerName, int Position){
        System.out.println(PlayerName + " managed to get into position " + Position + " on a High Score Table ");
    }

    public static int calculateHighScorePosition(int Score){
    /*    if(Score >= 1000){
            return 1;
        }
        else if(Score >= 500){
            return 2;
        }
        else if(Score >= 100){
            return 3;
        }
       else{
            return 4;
       }  */

       int Position = 4;

        if(Score >= 1000){
                Position = 1;
        }
        else if(Score >= 500){
            Position = 2;
        }
        else if(Score >= 100){
            Position = 3;
        }
        return Position;
    }
}
