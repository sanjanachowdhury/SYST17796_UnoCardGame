package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Class that models the main class of the UNO game application
 *
 * @author dana, hoda, lina, sanjana, 2020
 */
public class UnoGame {

    private CardValue value;
    private CardColor color;

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
        //player2.getHandOfCards().add(deck.dealCard());
        int currentPlayerIndex = 1;
        Player currentPlayer = player1;
        while (player1.getHandOfCards().size() > 0 && player2.getHandOfCards().size() > 0) {
            if (currentPlayerIndex == 1) {
                currentPlayer = player1;
                currentPlayerIndex = 2; // set the index to player2 in the next iteration
            } else {
                currentPlayer = player2;
                currentPlayerIndex = 1; // set the index to player1 in the next iteration
            }

            System.out.println(currentPlayer.toString() + " availble cards:");
            int cardIndex = 1;
            for (Card card : currentPlayer.getHandOfCards()) {
                System.out.print(cardIndex + ":" + card.toString());
                cardIndex++;
            }
            System.out.println(currentPlayer.toString() + ": Enter the card index you would like to play? ");
            int inputCardIndex = -1;

            while (inputCardIndex == -1) {
                inputCardIndex = sc.nextInt();
                if (inputCardIndex > currentPlayer.getHandOfCards().size()) {
                    System.out.println("Invalid card index .. please try again!");
                    inputCardIndex = -1;
                    continue;
                }
                Card selectedCard = currentPlayer.getHandOfCards().get(inputCardIndex - 1);
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

        game.declareWinner();
    }

}
