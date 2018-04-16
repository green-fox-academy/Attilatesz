import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerMain {
  public static void main(String[] args) {

  }

  public Card getHighestCard(List<Card> deckOne, List<Card> deckTwo) {
    deckOne.sort(Comparator.comparing(Card::getValue));
    deckTwo.sort(Comparator.comparing(Card::getValue));

    if ((deckOne.get(4).getValue()) > (deckTwo.get(4).getValue())){
      System.out.println("Black wins! - (High Card: " + convertIntValue(deckOne.get(4).getValue()) + ")");
      return deckOne.get(4);
    }
    System.out.println("White wins! - (High Card: " + convertIntValue(deckTwo.get(4).getValue()) + ")");
    return deckTwo.get(4);
  }

  public Object getPairs(List<Card> deckOne, List<Card> deckTwo) {
    Map<Object, Long> deckOneMap = deckOne.stream()
            .collect(Collectors.groupingBy(Card::getValue,
                    Collectors.counting()));

    Map<Object, Long> deckTwoMap = deckTwo.stream()
            .collect(Collectors.groupingBy(Card::getValue,
                    Collectors.counting()));

    List<Object> deckOneFiltered = deckOneMap.entrySet()
            .stream()
            .filter(o -> o.getValue() == 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    List<Object> deckTwoFiltered = deckTwoMap.entrySet()
            .stream()
            .filter(o -> o.getValue() == 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    if (deckOneFiltered.size() > deckTwoFiltered.size()) {
        return getTwoPairsBlackResult(deckOneFiltered);
    } else if (deckOneFiltered.size() < deckTwoFiltered.size()) {
        return getTwoPairsWhiteResult(deckTwoFiltered);
    } else if (deckOneFiltered.size() == 2) {
      if (((int) deckOneFiltered.get(0) + (int) deckOneFiltered.get(1)) > ((int) deckTwoFiltered.get(0) + (int) deckTwoFiltered.get(1))) {
        return getTwoPairsBlackResult(deckOneFiltered);
      }
        return getTwoPairsWhiteResult(deckTwoFiltered);
    }
    if ((int)deckOneFiltered.get(0) > (int)deckTwoFiltered.get(0)){
      System.out.println("Black wins! - (Pair: " + convertIntValue((int)deckOneFiltered.get(0)) + ")");
      return convertIntValue((int)deckOneFiltered.get(0));
    }
    System.out.println("White wins! - (Pair: " + convertIntValue((int)deckTwoFiltered.get(0)) + ")");
    return convertIntValue((int)deckTwoFiltered.get(0));
  }

  private String getTwoPairsBlackResult(List deckOneFiltered){
    String resultBlack = convertIntValue((int) deckOneFiltered.get(0)) + convertIntValue((int) deckOneFiltered.get(1));
    System.out.println("Black wins! - (Pair: " + resultBlack + ")");
    return resultBlack;
  }
  private String getTwoPairsWhiteResult(List deckTwoFiltered){
    String resultWhite = convertIntValue((int) deckTwoFiltered.get(0)) + convertIntValue((int) deckTwoFiltered.get(1));
    System.out.println("White wins! - (Pair: " + resultWhite + ")");
    return resultWhite;
  }

  private String convertIntValue(int value)  {
    if (value == 11)  {
      return "J";
    }else if (value == 12) {
      return "Q";
    }else if (value == 13)  {
      return "K";
    }else if (value == 14)  {
      return "A";
    }else {
      return String.valueOf(value);
    }
  }
}
