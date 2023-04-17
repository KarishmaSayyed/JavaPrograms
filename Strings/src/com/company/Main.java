package com.company;

public class Main {

    public static void main(String[] args) {
        int Bonus = 20;
        int HighScore = Calculate(true, 1000, 5, Bonus);
        System.out.println("Your Final Score is: " + HighScore);

        HighScore = Calculate(true, 10000, 8, 200);
        System.out.println("Your Final Score is: " + HighScore);


      /*  boolean GameOver = true;
        int Score = 1000;
        int LevelComplete = 5;
        int Bonus = 100;

        if(GameOver){
            int FirstScore = Score + (LevelComplete * Bonus);
            System.out.println("Your First Score is: " + FirstScore);
        }

        Score = 10000;
        LevelComplete =  8;
        Bonus = 200;

        if(GameOver){
            int SecondScore = Score + (LevelComplete * Bonus);
            System.out.println("Your Second Score Is: " + SecondScore
            );
        } */

    }

    public static int Calculate(boolean GameOver, int Score, int LevelComplete, int Bonus){
        if(GameOver){
            int FinalScore = Score + (LevelComplete * Bonus);
            FinalScore += 1000;
            return FinalScore;
        }
        return -1;
    }
}
