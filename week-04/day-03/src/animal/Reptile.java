package animal;

public class Reptile extends Animal {
  public Reptile(String name, int age, String gender, int hunger, String subspecies) {
    super(name, age, gender, hunger, subspecies);
  }

  public String breed(){
    String breed = "from an Egg.";
    return breed;
  }
}
