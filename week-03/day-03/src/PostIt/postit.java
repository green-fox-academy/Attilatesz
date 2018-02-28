package PostIt;

public class postit {

  String backgroundColor;
  String textOnIt;
  String textColor;

  @Override
  public String toString() {
    return "PostIt{" +
            "backgroundColor='" + backgroundColor + '\'' +
            ", textOnIt='" + textOnIt + '\'' +
            ", textColor='" + textColor + '\'' +
            '}';
  }

  public postit (String backgroundColor, String textOnIt, String textColor){
      this.backgroundColor = backgroundColor;
      this.textOnIt = textOnIt;
      this.textColor = textColor;

  }
}
