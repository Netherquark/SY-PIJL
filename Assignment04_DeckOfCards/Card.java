public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() { return rank; }
    public String getSuit() { return suit; }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public boolean hasSameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    public boolean hasSameSuit(Card other) {
        return this.suit.equals(other.suit);
    }
}

