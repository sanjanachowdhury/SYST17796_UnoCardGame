/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 * audit lina shalabi, 2020.
 */
public abstract class Player 
{
    
    private String userName; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique name
     * @param name the unique name to assign to this player.
     */
    public Player(String name)
    {
        userName= name;
    }
    /**
     * a method to test the length of the user name. it should be more than 3 
     * characters
     * @param name
     * @return 
     */
    public static boolean checkName(String name){
        if (name.length() >= 3) {
            return true;
        }
        return false;
    }
    
    public String getuserName() 
    {
        return userName;
    }

    /**
     * Ensure that the userName is unique
     * @param givenName the userName to set
     */
    public void setuserName(String givenName) 
    {
      
        userName = givenName;
    }
    
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
