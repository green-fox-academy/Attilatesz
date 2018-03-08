import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    int max = 0;
    if (a > b || a > c)
      max = a;
    if (b > a || b > c)
      max = b;
    if (c > a || c > b)
      max = c;
    return max;
  }

  int median(List <Integer> pool) {
    Collections.sort(pool);
    int middle = pool.size() / 2;
    double mid = ((double)pool.get(middle - 1) + (double)pool.get(middle)) / 2;
    if (pool.size() % 2 != 0){
      return pool.get(middle);
    } else {
      return (int) mid;
    }


  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}