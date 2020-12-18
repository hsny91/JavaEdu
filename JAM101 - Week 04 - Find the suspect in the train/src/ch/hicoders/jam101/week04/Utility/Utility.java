package ch.hicoders.jam101.week04.Utility;

import java.lang.Math;

public class Utility {
    public static int randomNumber() {
        // Generate the numbers
        int number = 1 + (int) (10 * Math.random());
        System.out.println(number);
        return number;
    }
    //method calculating the total score
    public static int totalScore(int pScore) {
        int score=(25)*(pScore);
        return score;
    }
}