import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {


  String wordOne = "abb bba";
  String wordTwo = "babbb a";
  Anagram anagram = new Anagram();

  @Test
  public void anagramTest() {
    assertTrue(anagram.anagram(wordOne, wordTwo));
  }
}