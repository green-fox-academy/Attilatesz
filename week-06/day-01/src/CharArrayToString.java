import java.util.Arrays;

public class CharArrayToString {
  public static void main(String[] args) {
    //Write a Stream Expression to convert a char array to a string!

    char[] animal = {'k', 'u', 't', 'y', 'a'};
    Arrays.stream(new String(animal).split(" ")).forEach(System.out::print);

  }
}
