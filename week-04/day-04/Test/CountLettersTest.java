import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters letter = new CountLetters();
  String word = "aattii";
  Map <Character, Integer> wordList = new HashMap <Character, Integer> ();

  void fillMap() {
    wordList.put('a', 2);
    wordList.put('t', 2);
    wordList.put('i', 2);
  }

  @Test
  public void testCountLetters() {
    fillMap();
    assertEquals(wordList, letter.countLetters(word));
  }
}