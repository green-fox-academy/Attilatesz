import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

  public List<Integer>numbers;

  public Sum(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public int sum(List <Integer> numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum = sum + num;
    }return sum;
  }

}
