package music;

public abstract class StringedInstrument extends Instrument {
  public int numberOfStrings;

  public StringedInstrument() {
  }

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  protected abstract String sound();

  public void play(){
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
