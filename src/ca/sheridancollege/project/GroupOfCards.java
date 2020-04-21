/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 *
 * @modifier Dana Alsibai April 19, 2020
 */
package ca.sheridancollege.project;


/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards { //The group of cards, stored in an ArrayList enum type

    private Card[] cards;
    private final int MAX_NUM_OF_CARDS =108;

    

     public GroupOfCards() {
        deck();
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
  
     public void deck() {
        cards = new Card[MAX_NUM_OF_CARDS];
        //an index is used to assing the value for each element of the array
        int index = 0;
        for (Color c : Color.values()) {
            for (Value v : Value.values()) {
                cards[index] = new Card();
                cards[index].setColor(c);
                cards[index].setValue(v);
                index++;//increment index to make it ready for the next element
            }
        }
    }
   
    public Card pickCard() {
        //select a random value (out of 15)
        int value = (int) (Math.random() * 15);
        //select a random suit (out of 4)
        int color = (int) (Math.random() * 4);

        Card card = new Card();
        card.setColor(Color.values()[color]);//set the random color to the card
        card.setValue(Value.values()[value]);//set the random value to the card

        return card;
    }
    
        public void shuffle(Card[] deck) {
        for (int i = 0; i < deck.length; i++) {//loop through the entire deck
            /*generate a random int from 0 t0 51 to be used as index of a card
            in the deck of cards. */
            int j = (int) (Math.random() * 108);
            //swap the randomly picked card with the present card
            Card temp = deck[j];
            deck[j] = deck[i];
            deck[i] = temp;
        }
    }
         public String toString() {
        String s = "";
        for (Card card : cards) {
            s += card.toString() + "\t";
        }
        return s;
    }
        
}//end class
