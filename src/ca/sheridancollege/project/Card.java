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
     Value value;
     Color color;

    public Card() {
    }
     
     

        public Card(Value value, Color color) {
            this.value = value;
            this.color = color;
        }

        public Value getValue() {
            return value;
        }

        public Color getColor() {
            return color;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "value=" + value +
                    ", Color=" + color +
                    '}';
        }
    }