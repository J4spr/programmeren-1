package Week7;

import java.util.Scanner;

public class Zoeken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] table = {16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14,
                12, 4, 10, 10, 16, 12, 10, 12, 20};

        Numbers numbers = new Numbers(table);
        System.out.println("Getallen: " + numbers);

        System.out.printf("\nGetal 12 komt %d keer voor.\n", numbers.numberOfTimes(12));
        System.out.printf("Getal 20 komt %d keer voor.\n", numbers.numberOfTimes(20) );
        System.out.printf("Getal 13 komt %d keer voor.\n", numbers.numberOfTimes(13) );

        int number;
        do {
            System.out.print("Welk getal wil je zoeken? (stop met -1): ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.printf("Het getal %d komt %s voor in de tabel\n", number, (numbers.isPresent(number) ? "" : "NIET "));
            }
        } while (number >= 0);
    }
}

class Numbers {
    private final int[] numbers;

    public Numbers(int[] theNumbers) {
        this.numbers = theNumbers;
    }

    public int numberOfTimes(int number) {
        int counter = 0;
        for (int i : this.numbers) {
            if (number == i)
                counter++;
        }
        return counter;
    }

    public boolean isPresent(int num) {
        for (int number : this.numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        for (int number : this.numbers){
            return String.format("%d ", number);
        }
        return " ";
    }
}
