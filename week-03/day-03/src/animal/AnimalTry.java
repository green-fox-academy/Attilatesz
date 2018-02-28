package animal;

public class AnimalTry{

public static void main(String[]args) {

  Animal cat = new Animal();
  cat.eat();
  cat.play();
  cat.drink();

  System.out.println(cat.toString());
  }

}