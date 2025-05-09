import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
    private final ArrayList<Card> cards = new ArrayList<>();
    private static final String[] SUITS = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private static final String[] RANKS = {
        "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };

    public void createDeck() {
        cards.clear();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(i + ": " + cards.get(i));
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < cards.size()) {
            System.out.println("Card at index " + index + ": " + cards.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    public void printCardsOfSuit(String suit) {
        boolean found = false;
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards found for suit: " + suit);
        }
    }

    public void compareCards(int index1, int index2) {
        if (index1 < 0 || index1 >= cards.size() || index2 < 0 || index2 >= cards.size()) {
            System.out.println("Invalid card indices.");
            return;
        }
        Card card1 = cards.get(index1);
        Card card2 = cards.get(index2);
        if (card1.hasSameRank(card2)) {
            System.out.println(card1 + " and " + card2 + " have the same rank.");
        } else {
            System.out.println(card1 + " and " + card2 + " have different ranks.");
        }
    }

    public void findCard(String rank, String suit) {
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Found card at index " + i + ": " + card);
                return;
            }
        }
        System.out.println("Card not found: " + rank + " of " + suit);
    }

    public void dealRandomCards(int count) {
        if (count > cards.size()) {
            System.out.println("Not enough cards to deal.");
            return;
        }
        Collections.shuffle(cards);
        System.out.println("Dealt cards:");
        for (int i = 0; i < count; i++) {
            System.out.println(cards.remove(0));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards, new Random());
    }
}

