import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundsWon = 0;
        char playAgain;

        System.out.println("================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("================================");

        do {
            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                if (guess == number) {
                    guessed = true;

                    int score = (maxAttempts - attempts + 1) * 10;
                    totalScore += score;
                    roundsWon++;

                    System.out.println("Correct! 🎉");
                    System.out.println("You guessed the number in "
                            + attempts + " attempts.");
                    System.out.println("Round Score: " + score);

                    break;

                } else if (guess < number) {
                    System.out.println("Too Low! Try again.");

                } else {
                    System.out.println("Too High! Try again.");
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("\nSorry! You used all your attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("\n--------------------------------");
            System.out.println("Rounds Won  : " + roundsWon);
            System.out.println("Total Score : " + totalScore);
            System.out.println("--------------------------------");

            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n================================");
        System.out.println("       GAME OVER");
        System.out.println("================================");
        System.out.println("Rounds Won  : " + roundsWon);
        System.out.println("Final Score : " + totalScore);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}