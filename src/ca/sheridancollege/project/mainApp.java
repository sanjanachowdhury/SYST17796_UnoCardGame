  /*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package ca.sheridancollege.project;

import java.util.List;
import java.util.Scanner;





/**
 *
 * @author danasebai
 */
public class mainApp {

 
    public static void main(String[] args) {
        
        Player player1 = new Player();
        Player player2 = new Player();
        
        Game game = new Game();
        GroupOfCards deck = new GroupOfCards();
        System.out.println("Welcom to UNO :)"); 
     //  System.out.print(deck.toString());
       System.out.println("Size of deck is: "+deck.getSizeOfCardPile());
       deck.shuffle();
    //   System.out.println("Deck after shuffling is "+ deck);
       
 
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Player One  ID : ");
        String playerInput = sc.nextLine();
        player1.setPlayerID(playerInput);
       
      
        
        System.out.print("Enter Player Two ID: ");
        String player2Input = sc.nextLine();
        player2.setPlayerID(player2Input);
      
     

        deck.dealCard(player1);
        System.out.println("Size of deck after dealing a hand of "
                + "card to player one is: "
                +deck.getSizeOfCardPile());
        deck.dealCard(player2);
        System.out.println("Size of deck after dealing a"
                + " hand of  card to player two is: "
                +deck.getSizeOfCardPile());

        System.out.println("Hand of " + player1.getPlayerID() + " is: "
                +player1.getHandOfCards().size());
        
        System.out.println("Hand of " + player2.getPlayerID() + " is: "
                +player2.getHandOfCards().size());

     //   player1.getHandOfCards().add(deck.dealCard());
        player2.getHandOfCards().add(deck.dealCard());
        
       System.out.println("Player1: What card would you like to play? ");
		String card = sc.nextLine();
	player1.getHandOfCards().add(deck.dealCard());
        
        System.out.println("Plyer2: What card would you like to play? ");
		String card2 = sc.nextLine();
	player2.getHandOfCards().add(deck.dealCard());
        
        game.declareWinner();
    }
    
  
   
   
}
    

        
    

    


