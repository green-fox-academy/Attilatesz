// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).


public class Bunnies {
  public static void main(String[] args) {
    int bunnieNumber = 50;

    System.out.println(computeEar(bunnieNumber));
  }

  private static int computeEar(int bunnieNumber) {
    if (bunnieNumber == 0){
      return 0;
    }else {
      return 2+computeEar(bunnieNumber-1);
    }
  }
}
