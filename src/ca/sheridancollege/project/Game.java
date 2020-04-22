/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 * @modified by sanjana chowdhury, 2020
 */
public class Game {

    //data Memebers
    private ArrayList<Player> players;// the players of the game
    GroupOfCards card = new GroupOfCards();
    Player player = new Player();

    /**
     * no argument Constructor
     */
    public Game() {
        players = new ArrayList();
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {

        if (card.cardPile.size() == 0) {
            System.out.println("It's a draw!");
        } else if (player.getHandOfCards().size() == 0) {
            System.out.println("Player 1 won!!!");
        } else {
            System.out.println("Player 2 won!!!");
        }

    }

}//end class
