public class NumberAdder {
  public static void main(String[] args) {

    System.out.println(numberAdder(10));
  }

  private static int numberAdder(int n) {
    if (n == 0){
      return 0;
    }else{
      System.out.println(n);
      return n+numberAdder(n-1);
    }
  }
}
