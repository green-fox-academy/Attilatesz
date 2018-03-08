import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  List<Integer>numbers = new ArrayList<>(Arrays.asList(1,2,3));
  Sum summer = new Sum(numbers);

  @Test
  public void sum() {
    assertEquals(6, summer.sum(numbers));
    }
  }
