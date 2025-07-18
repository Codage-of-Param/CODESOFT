/* Problem Statement:
 * 1. Generate a random number within a specified range, such as 1 to 100.
 * 2. Prompt the user to enter their guess for the generated number.
 * 3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
 * 4. Repeat steps 2 and 3 until the user guesses the correct number.
 * ##### You can incorporate additional details as follows:
 * 5. Limit the number of attempts the user has to guess the number.
 * 6. Add the option for multiple rounds, allowing the user to play again.
 * 7. Display the user's score, which can be based on the number of attempts taken or rounds won.
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static int score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuePlaying = true;
        Random random = new Random();

        while (continuePlaying) {
            int randomInt = random.nextInt(100) + 1; 
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("\nEnter a number between 1-100: ");
                int userNum = sc.nextInt();

                if (userNum > randomInt) {
                    System.out.println("Too High!");
                } else if (userNum < randomInt) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("You Guessed It! Hurray!!!");
                    score++;
                    guessedCorrectly = true;
                }
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            char rematch = sc.next().toLowerCase().charAt(0);
            if (rematch != 'y') {
                continuePlaying = false;
                System.out.println("\nYour Total Score is: " + score);
            }
        }
        sc.close();
    }
}
