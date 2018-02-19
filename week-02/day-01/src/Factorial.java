//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number:" );
        int number = scanner.nextInt();
        System.out.println(fact(number));
        }

        public static int fact(int facts){
        int facted = 1;

            for (int i = 1; i <= facts; i++) {
                facted = facted * i;
            }

            return facted;
        }
}
