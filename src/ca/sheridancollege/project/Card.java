/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */


    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    

   /**
    * 

    Description
    Card class creates a Card type that will be used to create a deck of cards
 */


public class Card {

    //the color and value from the Enums will be the data members
    private Color color;
    private Value value;

    /**
     * no-arg constructor can be used to instantiate a card without a rank of
     * suit
     */
    public Card() {
    }

    /**
     * Constructor for instantiating a card using its color and value
     *
     * @param color the color of the card
     * @param value the value of the card
     */
    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    /**
     * Mutator for getting the rank of a card
     *
     * @return the color of a card
     */
    public Color getColor() {
        return color;
    }

    /**
     * Mutator for setting the rank of a card
     *
     * @param color of a card
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Mutator for getting the suit of a card
     *
     * @return the value of a card
     */
    public Value getValue() {
        return value;
    }

    /**
     * Mutator for setting the suit of a card
     *
     * @param value of a card
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Override the toString method to get the long name and suit of a card in a
     * string format
     *
     * @return the name of a card in a string format
     */
    @Override
    public String toString() {
        return color.getName() + " of " + value.getName() + "\n";
    }

   
}