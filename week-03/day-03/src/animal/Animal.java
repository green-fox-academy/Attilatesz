package animal;

public class Animal {

  public int hunger = 50;
  public int thurst = 50;


  public Animal(){

    this.hunger = hunger;
    this.thurst = thurst;

  }

  @Override
  public String toString() {
    return "Animal{" +
            "hunger=" + hunger +
            ", thurst=" + thurst +
            '}';
  }

  public void eat(){
    hunger--;
  }

  public void drink(){
    thurst--;
  }

  public void play(){
    hunger--;
    thurst--;
  }

}

