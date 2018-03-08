import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
  public List<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));

  public int sum() {
    int sum = 0;
    for ( int num : numbers ) {
      sum = sum + num;
    }return sum;
  }

}
