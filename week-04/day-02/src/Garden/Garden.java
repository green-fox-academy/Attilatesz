package Garden;
import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants;
  private int waterAmount;


  public Garden() {
    plants = new ArrayList<>();
  }

  public boolean addPlants(Plant newPlant) {
    plants.add(newPlant);
    return true;
  }

  public String needWater() {
    String water = " ";
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).getWaterLevel() < 5) {
        water = " need water";
      } else if (plants.get(i) instanceof Flower && plants.get(i).getWaterLevel() > 5) {
        water = " doesnt need water";
      }
    }
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Tree && plants.get(i).getWaterLevel() < 10) {
        water = " need water";
      } else if (plants.get(i) instanceof Tree && plants.get(i).getWaterLevel() > 10) {
        water = " doesnt need water";
      }
    }return water;
  }

  public void watering(int waterAmount){
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).getWaterLevel() < 5) {
        double dividedWater = (waterAmount * plants.get(i).getAbsorbWater()/plants.size());
        plants.get(i).setWaterLevel(dividedWater);
      }
    }
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Tree && plants.get(i).getWaterLevel() < 10) {
        double dividedWater = (waterAmount * plants.get(i).getAbsorbWater()) / plants.size();
        plants.get(i).setWaterLevel(dividedWater);
      }
    }
  }

  public void info(){
    for (int i = 0; i < plants.size(); i++) {
      System.out.println("The " + plants.get(i).getColor() + plants.get(i).getType() + needWater());

    }
  }
}
