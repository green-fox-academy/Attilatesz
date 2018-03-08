import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  String word;

  public CountLetters() {
  }

  public static void main(String[] args) {

//    System.out.println(countLetters("attila").get('a'));
  }
  public Map< Character, Integer> countLetters(String word) {
    HashMap <Character, Integer> words = new HashMap<Character, Integer>();
    for (int i = 0; i < word.length(); i++) {
      char letter = (word.charAt(i));
      if(words.containsKey(letter)){
        int counter = words.get(letter);
        words.put(letter,++counter);
      }else {
        words.put(letter, 1);
      }
    }return words;
  }
}
