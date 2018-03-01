public class Counter {
  public static void main(String[] args) {

    int n = 100;
    counter(n);
    System.out.println(counter(n));

  }

  private static int counter(int n) {
    if (n == 0) {
      return 0;
    }else {
      System.out.println(n);
      return counter(n-1);
    }
  }
}

