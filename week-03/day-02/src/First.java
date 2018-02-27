

public class First {

  public static void main(String[] args) {

    int divider = 0;
    divided(divider);

  }

  public static void divided(int divider) {
    try {
      int result;
      int inputNumber = 10;
      result = inputNumber / divider;
      System.out.println(result);
    } catch (ArithmeticException a) {
      System.out.println("fail");
    }
  }
}
