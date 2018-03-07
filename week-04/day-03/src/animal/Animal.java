package animal;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int hunger;
  private String subSpecies;

  public Animal() {

  }

  public Animal(String name, int age, String gender, int hunger, String subSpecies){

    this.name = name;
    this.hunger = hunger;
    this.age = age;
    this.subSpecies = subSpecies;
    this.gender = gender;

  }

  public abstract String breed();

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public int getHunger() {
    return hunger;
  }

  public String getSubspecies() {
    return subSpecies;
  }
}
