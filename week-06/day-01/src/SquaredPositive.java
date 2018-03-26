import java.util.ArrayList;
import java.util.Arrays;

//Write a Stream Expression to get the squared value of the positive numbers from the following array:

public class SquaredPositive {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers
            .stream()
            .filter(n -> n * n > 20)
            .map(n -> n + " ")
            .forEach(System.out::print);
  }
}
