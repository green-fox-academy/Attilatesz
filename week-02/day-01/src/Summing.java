//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer


import java.lang.reflect.Array;
import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("The number: ");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }

    public static int sum(int summed) {
        int sums = 0;
        for (int i = 0; i <= summed; i++) {
        sums += i;
        }
        return sums;

    }
}
