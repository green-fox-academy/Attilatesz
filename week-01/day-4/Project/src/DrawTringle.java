import java.util.Scanner;

public class DrawTringle {
    public static void main(String[] args) {
        System.out.println("Your Number for Triangle: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        for (int i = 1; i <= userInput; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
                System.out.println("");
        }
        }
    }

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
