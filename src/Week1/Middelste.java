package Week1;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Middelste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal1, getal2, getal3;

        System.out.print("Geef het eerste getal in: ");
        getal1 = sc.nextInt();
        if (getal1 < 1 || getal1 > 100)
            System.out.println("Geef een getal tussen 1 en 100 in!");

        System.out.print("Geef het tweede getal in: ");
        getal2 = sc.nextInt();
        if (getal2 < 1 || getal2 > 100)
            System.out.println("Geef een getal tussen 1 en 100 in!");

        System.out.print("Geef het derde getal in: ");
        getal3 = sc.nextInt();
        if (getal2 < 1 || getal2 > 100)
            System.out.println("Geef een getal tussen 1 en 100 in!");

        int kleinsteGetal = Math.min(Math.min(getal1, getal2), getal3);
        int grootsteGetal = Math.max(Math.max(getal1, getal2), getal3);
        int middelsteGetal = getal1 + getal2 + getal3 - kleinsteGetal - grootsteGetal;

        System.out.printf("Het middelste getal is %d", middelsteGetal);
    }
}
