// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


public class Bunny2 {
  public static void main(String[] args) {
    int bunnieNumber = 5;

    System.out.println(computeEar(bunnieNumber));
  }

  private static int computeEar(int bunnieNumber) {
    if (bunnieNumber == 0) {
      return 0;
    } else if (bunnieNumber % 2 == 0) {
      return 3 + computeEar(bunnieNumber - 1);
    } else if (bunnieNumber % 2 == 1) {
      return 2 + computeEar(bunnieNumber - 1);
    }return bunnieNumber;
  }
}

