package Garden;

public class Flower extends Plant {

  public Flower(String type, String color) {
    super(type, color);
    setAbsorbWater(0.75);
  }
}
