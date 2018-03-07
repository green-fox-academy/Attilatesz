
import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String example;

  public Gnirts(String example) {
    this.example = example;

  }

public static class Shifter implements CharSequence {
    String example;
    int shifter;

    public Shifter(String example, int shifter){
      this.shifter = shifter;
      this.example = example;
    }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return example.charAt(index+shifter);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return example.charAt(example.length()-index-1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }

  public static void main(String[] args) {

    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));

    Shifter e = new Shifter("example", 2);
    System.out.println(e.charAt(0));

  }
}
