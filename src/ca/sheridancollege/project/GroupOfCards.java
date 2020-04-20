/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * @modifier Dana Alsibai April 19, 2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards { //The group of cards, stored in an ArrayList enum type

    private Color cardsColor;
    private Value cardValue;
    private int size;//the size of the grouping

    public GroupOfCards() {
    }
    

    public GroupOfCards(int givenSize) {
        size = givenSize;
    }

    public Color getCardsColor() {
        return cardsColor;
    }

    public void setCardsColor(Color CardsColor) {
        this.cardsColor = CardsColor;
    }

    public Value getCardValue() {
        return cardValue;
    }

    public void setCardValue(Value CardValue) {
        this.cardValue = CardValue;
    }
  
    public Color shuffleColor() {
     
    List<Color> color = new ArrayList<>();
          color.add(Color.BLUE);
          color.add(Color.GREEN);
          color.add(Color.RED);
          color.add(Color.YELLOW);
          
         this.cardsColor = color.get((int) (Math.random() * 3));
           
         return cardsColor;  // return this.CardsColor;
    }
    
     public Value shuffleValue() {
    List<Value> value = new ArrayList<>();
          for (Value value1: Value.values()) {
              value.add(value1);
          }
         this.cardValue = value.get((int) (Math.random() * 15));
           
         return cardValue;
    }
 
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
