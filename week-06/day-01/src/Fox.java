//Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fox {
  
  String color;
  String name;
  String type;

  public Fox(String name, String type, String color) {

    this.name = name;
    this.type = type;
    this.color = color;
  }

  public static void main(String[] args) {

    Fox foxOne = new Fox("Attila", "Red", "Red");
    Fox foxTwo = new Fox("Tojas", "Wild", "Green");
    Fox foxThree = new Fox("Anna", "Pallida", "Green");
    Fox foxFour = new Fox("Nanni", "Pallida", "Green");
    Fox foxFive = new Fox("Laci", "Black", "Black");

    ArrayList<Fox> foxes = new ArrayList<>();

    foxes.add(foxOne);
    foxes.add(foxTwo);
    foxes.add(foxThree);
    foxes.add(foxFour);
    foxes.add(foxFive);

    System.out.println(foxes
            .stream()
            .filter(c -> "Green".equals(c.color) && "Pallida".equals(c.type))
            .collect(Collectors.toList()));


  }

  @Override
  public String toString() {
    return "name: " + name + " " + "type: " + type + " " + "color: " + color;
  }
}
