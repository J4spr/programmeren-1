package Week2;

import java.util.Scanner;

public class Calorieen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long AVERAGE_CALORIES = 2256L;
        final long CALORIES_IN_PIZZA = 906L;
        final long MINIMUM_PEOPLE_COUNT = 1_000_000L;
        long peopleCount;

        System.out.print("Geef de naam van het land: ");
        String country = sc.nextLine();
        System.out.printf("Hoeveel mensen wonen er in %s?", country);
        peopleCount = sc.nextLong();

        while (peopleCount < MINIMUM_PEOPLE_COUNT) {
            System.out.print("Dit is te klein, geef een nieuw getal in: ");
            peopleCount = sc.nextLong();
            break;
        }

        long[] pizzaStuff = calculateCalories(AVERAGE_CALORIES, CALORIES_IN_PIZZA, peopleCount);


        System.out.printf("Alle inwoners gebruiken samen %d calorieen\n", pizzaStuff[0]);
        System.out.printf("Er zijn %d pizzas gemaakt", pizzaStuff[1]);


    }


    static long[] calculateCalories(final long AVERAGE_CALORIES, final long CALORIES_IN_PIZZA, long peoplecount) {
        long totalCalories = peoplecount * AVERAGE_CALORIES;
        long pizzaCount = totalCalories / CALORIES_IN_PIZZA;
        return new long[]{totalCalories, pizzaCount};
    }
}
