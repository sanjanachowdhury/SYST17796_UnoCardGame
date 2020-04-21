package ca.sheridancollege.project;

import java.util.List;
import java.util.Scanner;

/**
 * Class that models the main class of the UNO game application
 * 
 * @author dana, hoda, lina, sanjana, 2020
 */
public class UnoGame {

    public static void main(String[] args) {

        // creating player 1 & player 2 objects
        Player player1 = new Player();
        Player player2 = new Player();

        // the game object
        Game game = new Game();
        // the groupofcards object 
        GroupOfCards deck = new GroupOfCards();
        
        System.out.println("---------WELCOME TO UNO!!! :)---------");
        //  System.out.print(deck.toString());
        
        // displaying the size of the deck
        System.out.println("Size of deck is: " + deck.getSizeOfCardPile());
        deck.shuffle(); // shuffling the deck
        //   System.out.println("Deck after shuffling is "+ deck);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 ID: ");
        String playerInput = sc.nextLine();
        player1.setPlayerID(playerInput);

        System.out.print("Enter Player 2 ID: ");
        String player2Input = sc.nextLine();
        player2.setPlayerID(player2Input);

        deck.dealCard(player1);
        System.out.println("Size of deck after dealing a hand of "
                + "cards to player 1 is: "
                + deck.getSizeOfCardPile());
        deck.dealCard(player2);
        System.out.println("Size of deck after dealing a"
                + " hand of cards to player 2 is: "
                + deck.getSizeOfCardPile());

        System.out.println("Hand of " + player1.getPlayerID() + " is: "
                + player1.getHandOfCards().size());

        System.out.println("Hand of " + player2.getPlayerID() + " is: "
                + player2.getHandOfCards().size());

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
