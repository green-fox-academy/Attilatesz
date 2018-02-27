
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Log {

  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.


    try {
      Path path = Paths.get("log.txt");
      Files.readAllLines(path);
      List<String>lines = Files.readAllLines(path);
      String thisLine = "";
      lines.add(thisLine);
      for (String unique:lines) {
      }
      System.out.println(lines);

      } catch (IOException e1) {
      e1.printStackTrace();
    }
  }
}