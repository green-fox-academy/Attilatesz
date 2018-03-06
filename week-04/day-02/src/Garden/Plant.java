package Garden;

public class Plant extends Garden {

  private String type;
  private String color;
  private double absorbWater;
  private double waterLevel;

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }

  public double getAbsorbWater() {
    return absorbWater;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAbsorbWater(double absorbWater) {
    this.absorbWater = absorbWater;
  }

  public Plant(String type, String color){

    this.type = type;
    this.color = color;

  }

}



