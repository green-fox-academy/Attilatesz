package animal;

public class Mammal extends Animal {

  public Mammal(String name, int age, String gender, int hunger, String subspecies) {
    super(name, age, gender, hunger, subspecies);
  }

  public String breed() {
    String breed = "pushing miniature versions out.";
    return breed;
  }
}
