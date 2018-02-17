import java.util.Scanner;

public class DrawADiagonal {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println();
        for (int column = 1; column <= userInput; column++) {
            for (int row = 1; row <= userInput; row++) {
                if(column == row)
                {
                System.out.print("%");
                }
                else if ((column == 1) || (userInput == column)){
                System.out.print("%");
                }
                else if ((row == 1) || (userInput == row)) {
                System.out.print("%");
                }
                else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was