package Week1;

import java.util.Scanner;

public class Sommeren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean toestandVanGetal = true;
        int totaal = 0;
        int aantalingaven = 0;
        double gemiddelde = 0;
        while (toestandVanGetal) {

            System.out.print("Geef een getal in (stop met 0) ");
            int getal = sc.nextInt();
            totaal += getal;
            aantalingaven++;

            gemiddelde = totaal/aantalingaven;
            if (getal == 0)
                toestandVanGetal = false;

        }
        System.out.printf("De totale som is: %d\n", totaal);
        System.out.printf("Je hebt %d getallen inggeven\n", aantalingaven);
        System.out.printf("Het gemiddelde is: %.2f\n", gemiddelde);
    }
}
