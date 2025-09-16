package Week1;

import java.util.Scanner;

public class Bewerkingen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal1, getal2, operator, totaal = 0;

        System.out.print("Geef een getal ");
        getal1 = sc.nextInt();
        System.out.print("Geef een tweede getal ");
        getal2 = sc.nextInt();

        System.out.println("Kies een bewerking: \n1 Optellen\n2 aftrekken\n3 vermenigvuldigen\n4 delen");
        operator = sc.nextInt();

        if (operator == 1) {
            totaal = getal1 + getal2;
            System.out.printf("Jouw uitkomst is %d", totaal);
        }
        if (operator == 2) {
            totaal = getal1 - getal2;
            System.out.printf("Jouw uitkomst is %d", totaal);
        }
        if (operator == 3) {
            totaal = getal1 * getal2;
            System.out.printf("Jouw uitkomst is %d", totaal);
        }
        if (operator == 4) {
            totaal = getal1 / getal2;
            System.out.printf("Jouw uitkomst is %d", totaal);
        }
        if (operator < 0 || operator > 4)
            System.out.println("Geef een geldig getal");
    }
}
