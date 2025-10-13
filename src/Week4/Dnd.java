package Week4;

import java.util.Random;
import java.util.Scanner;

public class Dnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hoeveel zijden?");
        int sides = sc.nextInt();
        Dice dice = new Dice(sides);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Druk op <enter> om te rollen");
            sc.nextLine();
            System.out.printf("%d\n", dice.rollDice());
        }
    }
}

class Dice {
    int sideCount;

    public Dice(int sides) {
        this.sideCount = sides;
    }

    public int setSideCount(int sides) {
        this.sideCount = sides;
        return sideCount;
    }

    public int getSideCount() {
        return sideCount;
    }

    public int rollDice() {
        Random generator = new Random();
        return generator.nextInt(1, this.sideCount + 1);
    }
}
