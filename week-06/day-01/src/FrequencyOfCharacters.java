import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfCharacters {
  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of characters in a given string!

    String s = "Write a Stream Expression to find the frequency of characters in a given string!";
    s.chars()
            .mapToObj(t -> Character.toString((char) t))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
            .forEach((k, v) -> System.out.println(k + " = " + v));
//    frequency.forEach((k, v) -> System.out.println(k + " = " + v));


  }
}
