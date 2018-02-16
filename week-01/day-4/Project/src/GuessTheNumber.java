import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberRandom = random.nextInt(100) + 1;
        int numberGuess = 0;

        while (numberGuess != numberRandom) {
            System.out.println("Guess a number between 1-100: ");
            numberGuess = scanner.nextInt();
            if (numberGuess < numberRandom) {
                System.out.println("The stored number is higher!");
            } else if (numberGuess > numberRandom) {
                System.out.println("The stored number is lower!");
            } else if (numberGuess == numberRandom) {
                System.out.println("You found the number: " + numberRandom + "!");
            }
        }
    }
    }
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8