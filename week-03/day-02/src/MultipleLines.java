// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleLines {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.println("Please give me the filename: ");
    String fileName = name.nextLine();

    Scanner word = new Scanner(System.in);
    System.out.println("Please give me a word: " );
    String words = word.nextLine();

    Scanner lines = new Scanner(System.in);
    System.out.println("Please give the number lines: " );
    int lineNumber = lines.nextInt();

    writer(fileName, words, lineNumber);
  }

  private static void writer(String fileName, String word, int lines) {

    List words = new ArrayList();
    for (int i = 0; i < lines; i++) {
      words.add(word);
    }
    try {
      Path path = Paths.get(fileName);
      Files.write(path, words);
    }catch (Exception e){
      System.out.println("nem nem");
    }

  }
}
