package music;

public class Violin extends StringedInstrument {

  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    name = "Violin";
  }

  @Override
  protected String sound() {
    String sound = "Screech.";
    return sound;
  }
}
