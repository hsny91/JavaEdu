import java.util.Scanner;

public class Suspect {
    public static void main(String [] args){
        Utility utility=new Utility();
        int random=utility.randomNumber();
        guessingNumberGame(random);
    }
    public static void guessingNumberGame(int randomNumber)
    {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        //int number = 1 + (int)(10 * Math.random());

        // Given K trials
        int trial = 4;

        int index, guess;

        System.out.println("A number is chosen" + " between 1 to 10." + "Guess the number" + " within 4 trials.");

        // Interate over K Trials
        for (index = 0; index < trial; index++) {

            System.out.println("Guess the number:");
            guess = scanner.nextInt();

            // If the number is guessed
            if (randomNumber == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (randomNumber > guess && index != trial - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (randomNumber < guess && index != trial - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (index == trial) {
            System.out.println("You have exhausted" + " K trials.");

            System.out.println("The number was " + randomNumber);
        }
    }
}
