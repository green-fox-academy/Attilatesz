import java.util.stream.Collectors;

public class UpperCaseInString {
  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    String s = "Write a Stream Expression to find the uppercase characters in a string!";

    System.out.println(s.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString ((char) c))
            .collect(Collectors.joining(", ")));
  }
}
