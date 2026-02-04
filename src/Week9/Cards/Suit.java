package Week9.Cards;

public enum Suit {
    SPADES("schoppen"),
    CLUBS("klaveren"),
    DIAMONDS("ruiten"),
    HEARTS("harten");

    private final String dutchName;

    Suit(String dutchName) {
        this.dutchName = dutchName;
    }

    @Override
    public String toString() {
        return this.dutchName;
    }
}

