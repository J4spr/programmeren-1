package Week9.Cards;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
        System.out.printf("%s %s\n",card1.getSuit(), card1.getValueAsInt());
        System.out.printf("%s %s\n",card2.getSuit(), card2.getValueAsInt());
        System.out.printf("%s %s\n",card3.getSuit(), card3.getValueAsInt());
        System.out.printf("%s %s\n",card4.getSuit(), card4.getValueAsInt());
        System.out.printf("%s %s\n",card5.getSuit(), card5.getValueAsInt());

    }
}
