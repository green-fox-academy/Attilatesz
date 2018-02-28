package counter;

public class Counter {

  static int counter = 0;
  int reset;

  public Counter(int counter) {
    this.counter = counter;
    reset =counter;
  }

  public Counter(){
    counter = 0;
  }


  public void add() {
    counter++;
  }

  public void add(int number) {
    counter += number;
  }

  public int get() {
    return counter;
  }

  public void reset(){
    counter = reset;
  }

}