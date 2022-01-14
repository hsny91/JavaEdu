package ch.hicoders.jam101.week04.utility;

import java.util.Random;

public class Utility {

    // Generate the numbers
    public static int randomNumber() {
        Random random=new Random();
        return random.nextInt(10)+1;
    }

    //method calculating the total score
    public static int totalScore(int trial) {
        int score=25*trial;
        return score;
    }
}