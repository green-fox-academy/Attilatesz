import static org.junit.Assert.*;

public class ApplesTest {

  Apples apple = new Apples("apple");

  @org.junit.Test
  public void getAppleTest() {
    assertNotEquals("apples", apple.getApple());
  }
}