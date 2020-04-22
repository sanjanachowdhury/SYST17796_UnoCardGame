package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Class that models the main class of the UNO game application
 *
 * @author dana, hoda, lina, sanjana, 2020
 */
public class UnoGame {

    //Private data memebers 
    private CardValue value;
    private CardColor color;

    public static void main(String[] args) {

        // creating player 1 & player 2 objects
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner sc = new Scanner(System.in);

        // the game object
        Game game = new Game();
        // the groupofcards object 
        GroupOfCards deck = new GroupOfCards();

        System.out.println("---------WELCOME TO UNO!!! :)---------");

        // displaying the size of the deck
        System.out.println("Size of deck is: " + deck.getSizeOfCardPile());
        deck.shuffle(); // shuffling the deck

        /**
         * this is the first player
         */
        System.out.print("Enter Player 1 ID: ");
        String playerInput = sc.nextLine();
        player1.setPlayerID(playerInput);

        /**
         * this is the second player
         */
        System.out.print("Enter Player 2 ID: ");
        String player2Input = sc.nextLine();
        player2.setPlayerID(player2Input);

        /**
         * dealCard for the first player
         */
        deck.dealCard(player1);
        System.out.println("Size of deck after dealing a hand of "
                + "cards to player 1 is: "
                + deck.getSizeOfCardPile());

        /**
         * dealCard for the first player
         */
        deck.dealCard(player2);
        System.out.println("Size of deck after dealing a"
                + " hand of cards to player 2 is: "
                + deck.getSizeOfCardPile());

        System.out.println("Hand of " + player1.getPlayerID() + " is: "
                + player1.getHandOfCards().size());

        System.out.println("Hand of " + player2.getPlayerID() + " is: "
                + player2.getHandOfCards().size());

        /**
         * this when the game start
         */
        int currentPlayerIndex = 1;
        Player currentPlayer = player1;

        while (player1.getHandOfCards().size() > 0
                && player2.getHandOfCards().size() > 0) {

            if (currentPlayerIndex == 1) {
                currentPlayer = player1;
                currentPlayerIndex = 2; // set the index to player2 in the next iteration
            } else {
                currentPlayer = player2;
                currentPlayerIndex = 1; // set the index to player1 in the next iteration
            }
            // Print the hand of the first player 
            System.out.println(currentPlayer.toString() + " availble cards:");
            int cardIndex = 1;
            for (Card card : currentPlayer.getHandOfCards()) {
                System.out.print(cardIndex + ":" + card.toString());
                cardIndex++;
            }
            //print the hand for the second player
            System.out.println(currentPlayer.toString()
                    + ": Enter the card index you would like to play between ? ");
            int inputCardIndex = -1;

            while (inputCardIndex == -1) {
                inputCardIndex = sc.nextInt();
                if (inputCardIndex > currentPlayer.getHandOfCards().size()) {
                    System.out.println("Invalid card index .. please try again!");
                    inputCardIndex = -1;
                    continue;
                }
                Card selectedCard = currentPlayer.getHandOfCards()
                        .get(inputCardIndex - 1);
                if (selectedCard.getValue() == CardValue.SKIP) {
                    if (currentPlayerIndex == 1) {
                        currentPlayerIndex = 2;
                    } else {
                        currentPlayerIndex = 1;
                    }
                }

                currentPlayer.getHandOfCards().remove(inputCardIndex - 1);
            }

        }
        /**
         * declare the winner
         */
        game.declareWinner();
    }
}
