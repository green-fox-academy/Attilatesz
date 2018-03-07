package music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Electric Guitar";
  }

  protected String sound() {
    String sounds = "Twang.";
    return sounds;
  }

}
