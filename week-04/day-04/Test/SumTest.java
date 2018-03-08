import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  List<Integer>numbers = new ArrayList<>(Arrays.asList(6,5,4,8));
  Sum summer = new Sum(numbers);

  @Test
  public void sumTest() {
    assertEquals(23, summer.sum(numbers));
    }
  }
