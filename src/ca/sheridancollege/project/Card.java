/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 * Description Card class creates a Card type that will be used to create a deck
 * of cards
 *
 * @author dancye, 2018
 * @modified by dana, sanjana, hoda, lina, 2020
 */

public class Card {

    CardValue value;
    CardColor color;

    public Card() {
    }

    public Card(CardValue value, CardColor color) {
        this.value = value;
        this.color = color;
    }

    public CardValue getValue() {
        return value;
    }

    public CardColor getColor() {
        return color;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{"
                + "value=" + value
                + ", Color=" + color
                + '}';
    }
}
