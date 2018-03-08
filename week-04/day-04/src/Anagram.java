public class Anagram {

  String wordOne;
  String wordTwo;

  public Anagram(String wordOne, String wordTwo) {

    this.wordOne = wordOne;
    this.wordTwo = wordTwo;
  }

  public Anagram() {

  }

  public boolean anagram(String wordOne, String wordTwo) {
    if (wordOne.length() != wordTwo.length()) {
      return false;
    }
    char[] characters = wordOne.toCharArray();

    for (char c : characters) {
      int index = wordTwo.indexOf(c);
      if (index != -1) {
        wordTwo = wordTwo.substring(0, index) + wordTwo.substring(index + 1);
      } else {
        return false;
      }
    }return wordTwo.isEmpty();
  }
}
