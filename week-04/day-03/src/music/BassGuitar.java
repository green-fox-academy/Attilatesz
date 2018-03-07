package music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;

  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Bass Guitar";
  }

  @Override
  protected String sound() {
      String sounds = "Duum-duum-duum.";
      return sounds;
    }
}
