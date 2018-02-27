import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String fileName = "attila";
    String fileNameCopy = "attilacopy";

    System.out.println(copyFiles(fileName, fileNameCopy));


  }

  private static boolean copyFiles(String fileName, String fileNameCopy) {
    try {
      Path path = Paths.get(fileName);
      Path copyPath = Paths.get(fileNameCopy);
      Files.copy(path, copyPath);
      return true;
    }catch (Exception e){
      return false;
    }


  }
}
