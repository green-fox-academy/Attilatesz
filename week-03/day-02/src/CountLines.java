import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    int lineCount = 0;
    int lineSize = 0;
    String fileName = "readme.txt";
    long number = counter(lineCount);
    System.out.println(number);

    int result = counterHard(fileName);
    System.out.println(result);

  }

  private static int counterHard(String lineCount) {
    try {
      Path pathFile =  Paths.get(lineCount);
      List <String> lineSize = Files.readAllLines(pathFile);
      return lineSize.size();
    }catch (IOException a){
      return 0;
    }

  }

  private static long counter(int lineCounter) {
    String fileName = "readme.txt";
    try {
      Path pathFile = Paths.get(fileName);
      long lineCount =(int) Files.lines(pathFile).count();
      return lineCount;
    } catch (IOException e) {
      return 0;
    }

  }
}

