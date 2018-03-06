package Garden;

public class Main {
  public static void main(String[] args) {

    Plant flowerOne = new Flower(" Flower", "yellow");
    Plant flowerTwo = new Flower(" Flower", "blue");
    Plant treeOne = new Tree(" Tree", "purple");
    Plant treeTwo = new Tree(" Tree", "orange");

    Garden garden = new Garden();

    garden.addPlants(flowerOne);
    garden.addPlants(flowerTwo);
    garden.addPlants(treeOne);
    garden.addPlants(treeTwo);

    garden.watering(70);

    garden.info();
  }
}

