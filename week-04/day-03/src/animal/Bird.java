package animal;

import Vehicle.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name, int age, String gender, int hunger, String subspecies) {
    super(name, age, gender, hunger, subspecies);
  }
  public String breed() {
    String breed = "from an Egg.";
    return breed;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
