
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String[] suitTypes = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] rankTypes = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardDeck = createDeck(suitTypes, rankTypes);
        cardDeck = shuffleDeck(cardDeck);
        System.out.println("Enter number of players and cards per player:");
        int numberOfPlayers = myScan.nextInt();
        int cardsPerPlayer = myScan.nextInt();
        String[][] distributedCards = distributeCards(cardDeck, numberOfPlayers, cardsPerPlayer);

        if (distributedCards != null) {
            displayPlayerCards(distributedCards);
        }
    }
    public static String[] createDeck(String[] suitTypes, String[] rankTypes) {
        int totalCards = suitTypes.length * rankTypes.length;
        String[] cardDeck = new String[totalCards];
        int deckIndex = 0;
        for (int suitIndex = 0; suitIndex < suitTypes.length; suitIndex++) {
            for (int rankIndex = 0; rankIndex < rankTypes.length; rankIndex++) {
                cardDeck[deckIndex++] = rankTypes[rankIndex] + " of " + suitTypes[suitIndex];
            }
        }
        return cardDeck;
    }
    public static String[] shuffleDeck(String[] cardDeck) {
        int deckSize = cardDeck.length;
        for (int currentIndex = 0; currentIndex < deckSize; currentIndex++) {
            int randomIndex = currentIndex + (int) (Math.random() * (deckSize - currentIndex));
            String tempCard = cardDeck[currentIndex];
            cardDeck[currentIndex] = cardDeck[randomIndex];
            cardDeck[randomIndex] = tempCard;
        }
        return cardDeck;
    }
    public static String[][] distributeCards(String[] cardDeck, int numberOfPlayers, int cardsPerPlayer) {
        if (numberOfPlayers * cardsPerPlayer > cardDeck.length) {
            System.out.println("Cards cannot be distributed");
            return null;
        }
        String[][] playersCards = new String[numberOfPlayers][cardsPerPlayer];
        int deckPointer = 0;
        for (int playerIndex = 0; playerIndex < numberOfPlayers; playerIndex++) {
            for (int cardIndex = 0; cardIndex < cardsPerPlayer; cardIndex++) {
                playersCards[playerIndex][cardIndex] = cardDeck[deckPointer++];
            }
        }
        return playersCards;
    }
    public static void displayPlayerCards(String[][] playersCards) {
        for (int playerIndex = 0; playerIndex < playersCards.length; playerIndex++) {
            System.out.println("\nPlayer " + (playerIndex + 1) + " cards:");
            for (int cardIndex = 0; cardIndex < playersCards[playerIndex].length; cardIndex++) {
                System.out.println(playersCards[playerIndex][cardIndex]);
            }
        }
    }
}
