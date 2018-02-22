import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/*Write a program where the program chooses a number between 1 and 100.
 The player is then asked to enter a guess. If the player guesses wrong,
 then the program gives feedback and ask to enter an other guess until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)*/


public class Guesses {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a range: ");

        int selectedRange = scanner.nextInt();
        List<Integer> guessedNumber = new ArrayList<Integer>();
        int rangeOfList = 0;
        int randomNumber = random.nextInt(rangeOfList + 1);
        System.out.println("Your range is " + "0 - " + selectedRange);
        Scanner numberGuessed = new Scanner(System.in);


        pickedRange(guessedNumber, rangeOfList);
        pickANumber(pickedRange(guessedNumber,rangeOfList), randomNumber);



    }

    private static void pickANumber(List<Integer> integers, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        int pickedNumber = scanner.nextInt();
    }

    public static List<Integer> pickedRange(List<Integer> guessRange, int range) {
        for (int addedNumbers = 0; addedNumbers < range; addedNumbers++) {
            guessRange.add(addedNumbers);
        }return guessRange;
    }
}
