package Assignment.GameWheel5;

import java.util.*;
import java.lang.*;

public class GameWheel {
  private ArrayList<PrizeCard> prizeCards;
  private int currentPos;

  public GameWheel() {
    prizeCards = new ArrayList<PrizeCard>();
    currentPos = 0;
    prizeCards = initGameWheel();
    prizeCards = scramble();
  }

  public ArrayList<PrizeCard> initGameWheel() {
    ArrayList<PrizeCard> init = new ArrayList<PrizeCard>();
    for (int i=1; i <= 40; i++) {
      if (i%2 == 1)
        init.add(new PrizeCard(i, "red", i*10));
      else if (i%10 == 0)
        init.add(new PrizeCard(i, "black", i*200));
      else
        init.add(new PrizeCard(i, "blue", i*100));
    }
    return init;
  }

  public ArrayList<PrizeCard> getPrizeCards() {
    return prizeCards;
  }

  public ArrayList<PrizeCard> scramble() {
    // This method will scramble the ordering of the Prize Cards in the Game Wheel. Be careful, because
    // the pattern of the coloring must be maintained (i.e. the first Prize Card should still be a card
    // that is red, but likely a different ID number and prize amount, the second Prize Card should
    // still be a card that is blue, the tenth Prize Card should still be black). In other words, once
    // a color is assigned to a Prize Card, it does not change; when the wheel is scrambled, it is only
    // putting cards that are already red in the places where red cards belong (odd numbered places),
    // black cards where black cards belong (multiples of 10), and blue cards where blue cards belong
    // (even numberedplaces).

	ArrayList<PrizeCard> old = this.getPrizeCards();
    ArrayList<PrizeCard> scrambled = new ArrayList<PrizeCard>();
    for(int index = 1; index <= old.size(); index++) {
    	int length = old.size();
    	while(true) {
	    	int oldIndex = (int) (Math.random() * length);
	    	PrizeCard card = old.get(oldIndex);
	    	
	    	String targetColor  = index%2 == 1 ? "red" : (index%10 == 0 ? "black" : "blue");
	    	String currentColor = card.getID()%2 == 1 ? "red" : (card.getID()%10 == 0 ? "black" : "blue");
	    	
	    	if(targetColor.equals(currentColor)) {
	    		old.remove(index);
	    		scrambled.add(card);
	    		break;
	    	}
	    }
    }
    return scrambled;
  }
    
  public PrizeCard spinWheel() {
    //spin power between range of 1-100 (inclusive)
    int power = (int)(Math.random()*100 + 1);
    int newPos = (currentPos + power) % prizeCards.size();
    currentPos = newPos;
    return prizeCards.get(currentPos);
  }


}
