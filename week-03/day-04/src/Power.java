public class Power {
  public static void main(String[] args) {
    int base = 10;
    int n = 2;
    System.out.println(power(base,n));
  }

  private static int power(int base, int n) {
    if(n == 0){
      return 1;
    }else {
      return base * power(base,n-1);
    }
  }
}
