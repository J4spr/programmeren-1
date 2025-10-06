package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dobbelsteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times;
        System.out.print("Geef het aantal keer dat je dobbelsteen moet rollen: ");
        times = sc.nextInt();

        ArrayList<Integer> diceRolls = rollDice(times);

       /* System.out.println("Je worpen:");
        for (int roll : diceRolls) {
            System.out.println(roll);
        }*/

        int[] rollsArray = diceRolls.stream().mapToInt(Integer::intValue).toArray();

        int[] counts = countNumbers(rollsArray);

        System.out.println("\nSamenvatting:");
        System.out.printf("Ones: %d\n", counts[0]);
        System.out.printf("Twos: %d\n", counts[1]);
        System.out.printf("Threes: %d\n", counts[2]);
        System.out.printf("Fours: %d\n", counts[3]);
        System.out.printf("Fives: %d\n", counts[4]);
        System.out.printf("Sixes: %d\n", counts[5]);
    }

    static ArrayList<Integer> rollDice(int times) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            numbers.add((int) (Math.random() * 6 + 1));
        }
        return numbers;
    }

    static int[] countNumbers(int[] number) {
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
        for (int n : number) {
            switch (n) {
                case 1 -> ones++;
                case 2 -> twos++;
                case 3 -> threes++;
                case 4 -> fours++;
                case 5 -> fives++;
                case 6 -> sixes++;
            }
        }
        return new int[]{ones, twos, threes, fours, fives, sixes};
    }
}
