public class Strings {
  public static void main(String[] args) {
    String word = "xxxAttilaxxx";
    char from = 'x';
    char to = 'y';
    System.out.println(replacer(word, from, to));
  }

  private static String replacer(String replace, char from, char to) {
    if (replace.length() < 1){
      return replace;
    }else {
      char first = from == replace.charAt(0) ? to : replace.charAt(0);
      return first + replacer(replace.substring(1),from,to);

    }
  }
}
