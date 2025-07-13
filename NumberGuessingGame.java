import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean hasGuessedCorrectly = false;

            System.out.println("\nselected a number between 1 and 100. Try to guess");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess;
                if (!scanner.hasNextInt()) {
                    System.out.println("enter a valid number!");
                    scanner.next(); 
                    continue;
                }

                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println(" Perfect! You guessed it in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1); 
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();

            playAgain = userResponse.equalsIgnoreCase("yes");
        }

        System.out.println("\nGame Over! Your total score: " + totalScore);
        System.out.println("You did good!");
        scanner.close();
    }
}
