package Week7.List;

public class List {
    private int[] numbers;
    private int size;

    public List(int capacity) {
        this.numbers = new int[capacity];
        this.size = capacity;
    }

    public boolean add(int number) {
        // het getal wordt op het einde in de array gestockeerd en size wordt verhoogd
        //  als de maximum capaciteit overschreden werd, wordt false teruggegeven
        // ...
        return true;
    }

    public int size() {
        // geeft het aantal elementen in de lijst terug
        // ...
        return this.size;
    }

    public int get(int i) {
        // geeft het i-de element terug of -1 als het niet bestaat.
        // ...
        if (i + 1 > this.numbers.length)
            return -1;

        for (int j = 0; j < this.numbers.length; j++) {
            if (this.numbers[i] == j) {
                return j;
            }
        }
        return -1;
    }

    // Gevorderd: kan je deze methode aanvullen?
    public boolean remove(int index) {
        // deze methode verwijdert het element op de gegeven plaats
        // alle elementen hierna moeten dus 1 plaats opgeschoven worden
        // de return value geeft weer of het element bestond en succesvol verwijderd is
        return true;
    }
}
