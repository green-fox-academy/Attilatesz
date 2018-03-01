public class StringAgain {
  public static void main(String[] args) {
    String word = "Attxxilxxa";
    char from = 'x';
    char to = 0;

    System.out.println(replaceAgain(word,from,to));
  }

  private static String replaceAgain(String replace, char from, char to) {
    if (replace.length() < 1){
        return replace;
      }else {
        char first = from == replace.charAt(0) ? to : replace.charAt(0);
        return first + replaceAgain(replace.substring(1),from,to);
      }
    }
  }
