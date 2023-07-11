import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
     private static final int MAX_GUESSES = 10;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(MAX_NUMBER) + 1;
        int userScore = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and " + MAX_NUMBER);
        System.out.println("You have " + MAX_GUESSES + " guesses to find it.");

        for (int i = 0; i < MAX_GUESSES; i++) {
            System.out.print("Guess #" + (i + 1) + ": ");
            int guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                userScore = MAX_GUESSES - i;
                break;
            }
        }

        System.out.println("Game over!");
        System.out.println("The number was: " + secretNumber);
        System.out.println("Your score: " + userScore);
    }
}
