public class Card {

  private int value;
  private String color;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Card(String value, String color) {
    this.value = changeValue(value);
    this.color = color;
  }

  private int changeValue(String strValue) {
    if ("J".equals(strValue)) {
      return 11;
    } else if ("Q".equals(strValue)) {
      return 12;
    } else if ("K".equals(strValue)) {
      return 13;
    } else if ("A".equals(strValue)) {
      return 14;
    } else {
      return Integer.parseInt(strValue);
    }
  }

//  public String convertIntValue()  {
//    if (value == 11)  {
//      return "J";
//    }else if (value == 12) {
//      return "Q";
//    }else if (value == 13)  {
//      return "K";
//    }else if (value == 14)  {
//      return "A";
//    }else {
//      return String.valueOf(value);
//    }
//  }
}