package Garden;

public class Tree extends Plant {

  public Tree(String type, String color) {
    super(type, color);
    setAbsorbWater(0.4);
  }
}