import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PokerMainTest {


  @Test
  public void pokerTest(){
    PokerMain pokerMain = new PokerMain();

    List<Card> deckOne = new ArrayList<>(Arrays.asList(
            //Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
            new Card("2", "H"),
            new Card("5", "D"),
            new Card("5", "S"),
            new Card("K", "C"),
            new Card("K", "D")
    ));

    List<Card> deckTwo = new ArrayList<>(Arrays.asList(
            new Card("4", "C"),
            new Card("3", "H"),
            new Card("4", "S"),
            new Card("A", "C"),
            new Card("A", "H")
    ));

    Card resultOfHighCard = pokerMain.getHighestCard(deckOne, deckTwo);
    Object resultOfPair = pokerMain.getPairs(deckOne, deckTwo);

    Assert.assertEquals(deckTwo.get(4), resultOfHighCard);
    Assert.assertEquals("4A", resultOfPair);
  }

}