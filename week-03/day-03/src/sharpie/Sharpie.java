package sharpie;

public class Sharpie {

  String color;
  float width;

  @Override
  public String toString() {
    return "Sharpie{" +
            "color='" + color + '\'' +
            ", width=" + width + " , " + inkAmount + "}";
  }

  static float inkAmount = 100;


  public Sharpie(String color, float width) {

    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount--;
  }
}
