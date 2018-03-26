import java.util.ArrayList;
import java.util.Arrays;

//Write a Stream Expression to find which number squared value is more then 20 from the following array:

public class MoreThenTwenty {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers
            .stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .map(n -> n + " ")
            .forEach(System.out::print);
  }
}
