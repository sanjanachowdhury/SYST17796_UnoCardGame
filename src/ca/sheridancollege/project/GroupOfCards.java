/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * 
 * @modified by Dana, Hoda, Lina, Sanjana, 2020
 */
public class GroupOfCards { //The group of cards, stored in an ArrayList enum type

    List<Card> cardPile;

    public GroupOfCards() {
        this.cardPile = new ArrayList<>();
        for (Value value : Value.values()) {
            for (Color color : Color.values()) {
                cardPile.add(new Card(value, color));

            }
        }
    }

    public List<Card> getCardPile() {
        return cardPile;
    }

    public void shuffle() {
        Random rand = new Random();
        //Generate two random numbers between 0 to 76
        for (int i = 0; i < 7; i++) {
            int firstCard = rand.nextInt(15);
            int secondCard = rand.nextInt(15);
            Collections.swap(cardPile, firstCard, secondCard);
        }
    }

    public void dealCard(Player player) {
        //Get next card and add to hand of the player
        for (int i = 0; i < 7; i++) {

            Card deleteCard = cardPile.remove(0);
            player.getHandOfCards().add(deleteCard);
        }
    }

    public Card dealCard() {
        Card removedCard = cardPile.remove(0);
        return removedCard;
    }

    public Card drawCard() {
        if (cardPile.isEmpty()) {
            System.out.println("It is a draw");
        }
        return cardPile.remove(0);
    }

    //Size of the deck for testing purpose
    public int getSizeOfCardPile() {
        return cardPile.size();
    }

    @Override
    public String toString() {
        return "Deck{"
                + "cardDeck=" + cardPile
                + '}';
    }
}
