import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Your number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput == 0 || userInput < 0){
            System.out.println("Not Enough");
        }
        else if (userInput == 1) {
            System.out.println("One");
        }
        else if (userInput == 2) {
            System.out.println("Two");
        }
        else if (userInput > 2) {
            System.out.println("A lot");
        }


    }
}
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

