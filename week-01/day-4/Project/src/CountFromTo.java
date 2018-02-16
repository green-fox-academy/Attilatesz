import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        System.out.println("Please give me the first number: ");
        Scanner scanner = new Scanner(System.in);
        int userInputFirst = scanner.nextInt();
        System.out.println("Please give me the second number: ");
        int userInputSecond = scanner.nextInt();

        if (userInputSecond <= userInputFirst) {
            System.out.println("The second should be bigger!");
        }
        else if (userInputSecond > userInputFirst) {
            for (int i = userInputFirst; i < userInputSecond ; i++) {
                System.out.println(i);
            }
        }
    }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5