import animal.*;

public class Zoo {
  public static void main(String[] args) {

    Bird bird = new Bird("Parrot", 10, "male", 10, "Red");
    Reptile reptile = new Reptile("Crocodile", 60, "female", 15, "African");
    Mammal mammal = new Mammal("Koala", 15, "male", 5,"Australian");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
  }
}
