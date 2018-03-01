public class SumDigit {
  public static void main(String[] args) {
    System.out.println(summer(587));
  }

  private static int summer(int n) {
    if (n == 0) {
      return 0;
    } else{
      return (n % 10)+summer(n/10);
    }
  }
}
