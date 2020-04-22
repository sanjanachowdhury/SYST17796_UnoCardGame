/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 * @modified by Dana, Hoda, Lina, Sanjana, 2020
 */
public class Player {

    private String playerID; //the unique ID for this player
    private List<Card> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     * no argument Constructor
     */
    public Player() {
        this.hand = new ArrayList<Card>();
    }

    /**
     *
     * @return a hand of card as List
     */
    public List<Card> getHandOfCards() {
        return hand;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     *
     * @return a String representation of the Player
     */
    @Override
    public String toString() {
        return String.format("Player: %s", this.playerID);
    }
}
