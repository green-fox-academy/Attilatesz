
package Vehicle;

public abstract class Vehicle implements Flyable {

  String name;
  int age;
  String type;

  public Vehicle() {
  }

  public Vehicle(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }
}
