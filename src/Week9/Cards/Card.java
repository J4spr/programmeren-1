package Week9.Cards;

import java.util.Random;

public class Card {
    private Suit suit;
    private CardValue value;

    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }


    public Card() {
        this.suit = Suit.values()[new Random().nextInt(Suit.values().length)];
        this.value = CardValue.values()[new Random().nextInt(CardValue.values().length)];
    }

    public Suit getSuit() {
        return this.suit;
    }

    public CardValue getValue() {
        return this.value;
    }

    public int getValueAsInt() {
        return this.value.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.suit, this.value);
    }
}
