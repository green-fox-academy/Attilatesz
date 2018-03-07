package animal;

public class Bird extends Animal {

  public Bird(String name, int age, String gender, int hunger, String subspecies) {
    super(name, age, gender, hunger, subspecies);
  }
  public String breed() {
    String breed = "from an Egg.";
    return breed;
  }
}
