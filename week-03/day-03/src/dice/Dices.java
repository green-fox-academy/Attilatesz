package dice;

public class Dices {

  public static void main(String[] args) {

    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();



    for (int i = 0; i < myDice.getCurrent().length; i++) {
      while (myDice.getCurrent(i)!= 6) {
        myDice.reroll(i);
      }

    }

    for (int i = 0; i <myDice.getCurrent().length ; i++) {
      System.out.println(myDice.getCurrent(i));
    }

    }

  }
