package ch.hicoders.jam101.week04.suspectTrain;

import ch.hicoders.jam101.week04.utility.Utility;
import java.util.Scanner;

public class Suspect {
    public static void main(String [] args){
        int random= Utility.randomNumber();
        int remainingTrial=guessingNumberGame(random);
        int score= Utility.totalScore(remainingTrial);
        System.out.println("Total Score: "+score);
    }
    private static int guessingNumberGame(int randomNumber) {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        // Given trials
        int trial = 4;
        int index, guess;
        System.out.println("A number is chosen" + " between 1 to 10." + "Guess the number" + " within 4 trials.");

        // Interate over  Trials
        for (index = 0; index < 4; index++,trial--) {

            System.out.println("Guess the number:");
            guess = scanner.nextInt();

            // If the number is guessed
            if (randomNumber == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (randomNumber > guess ) {
                System.out.println("The number of vagon is " + "greater than " + guess);
            }
            else if (randomNumber < guess) {
                System.out.println("The number of vagon is" + " less than " + guess);
            }
            if (trial == 1) {
                System.out.println("You have exhausted trials.");
                System.out.println("The number was " + randomNumber);
            }
        }
        return trial;
    }
}

