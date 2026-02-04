package Week7;

import Week4.Car;

import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        String[] suits = {"Harten", "Schoppen", "Ruiten", "Klaveren"};
        String[] values = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Dame", "Heer"};
        Scanner sc = new Scanner(System.in);

        Random generator = new Random();
        int randomCard;
        int randomSuit;
        int cardCount;

        System.out.print("Hoeveel kaarten wil je: ");
        cardCount = sc.nextInt();

        Card[] cardArray = new Card[cardCount];

        for (int i = 0; i < cardCount; i++) {
            randomCard = generator.nextInt(0, values.length);
            randomSuit = generator.nextInt(0, suits.length);
            Card card = new Card(suits[randomSuit], values[randomCard]);
            System.out.printf("%s\n", card);
            cardArray[i] = card;
        }
//        debugging stuff
        /*
        System.out.print("\n");
        for (Card num : cardArray){
            System.out.println(num);
        }
        */
    }
}

class Card {
    private String suit;
    private String card;

    public Card(String suit, String card) {
        this.suit = suit;
        this.card = card;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Random[] createCards(int cardCount) {
        Random generator = new Random();
        Random[] cardArray = new Random[cardCount];
        for (int i = 0; i < cardCount; i++) {
            generator.nextInt();
            cardArray[i] = generator;
        }
        return cardArray;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.suit, this.card);
    }
}