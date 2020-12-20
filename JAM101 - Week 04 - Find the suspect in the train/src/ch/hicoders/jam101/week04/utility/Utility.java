package ch.hicoders.jam101.week04.utility;

import java.lang.Math;

public class Utility {

    // Generate the numbers
    public static int randomNumber() {
        int number = 1 + (int) (10 * Math.random());
        return number;
    }

    //method calculating the total score
    public static int totalScore(int trial) {
        int score=25*trial;
        return score;
    }
}