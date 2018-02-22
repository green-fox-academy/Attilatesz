import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static Scanner scanner;


    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression: ");

        Scanner scanner =new Scanner(System.in);

        calculate();


    }

    private static int calculate() {

        ArrayList<String> operators = new ArrayList<String>(Arrays.asList("+", "-", "*", "/", "%"));
        ArrayList<Integer> operands = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        scanner = new Scanner(System.in);
        String operatorPick = scanner.next();
        int operandOneScanner = scanner.nextInt();
        int operandTwoScanner = scanner.nextInt();


        checkIfIncluded(operands, operandOneScanner);
        checkIfIncluded(operands, operandTwoScanner);
        operatorIncluded(operators, operatorPick);

        int result = operations(operandOneScanner, operandTwoScanner, operatorPick);
        System.out.println(result);

    return result;
    }

    private static boolean checkIfIncluded(ArrayList<Integer> operands, int searchedNumber) {
        if (operands.contains(searchedNumber)) {
            return operands.contains(searchedNumber);
        } else System.out.println("Wrong input please give me a new number between 0-9!");
        return false;
        }

    private static boolean operatorIncluded(ArrayList<String>operators, String operatorPick ) {
        if (operators.contains(operatorPick)) {
            return operators.contains(operatorPick);
        } else System.out.println("Please pick an operator between +, -, *, /, %!");
        return false;
        }

    private static int operations(int operandOne, int operandTwo, String operator){
        int result = 0;
        if (operator.equals("+")){
            result = operandOne + operandTwo;
        }else if (operator.equals("*")){
            result = operandOne * operandTwo;
        }else if (operator.equals("-")){
            result = operandOne - operandTwo;
        }else if (operator.equals("/")){
            result = operandOne / operandTwo;
        }else if (operator.equals("%")){
            result = operandOne % operandTwo;
        }return result;

    }

}


