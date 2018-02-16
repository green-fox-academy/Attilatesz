import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Please give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print( i);
            System.out.print(" * ");
            System.out.print( userInput);
            System.out.print(" = ");
            System.out.println( i * userInput);

        }

    }
}
// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150