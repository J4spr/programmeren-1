package Week1;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tafel;
        boolean loop = true;
        while (loop) {
            System.out.print("Welke tafel wil je krijgen? ");
            tafel = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < 11; i++) {
                int uitkomst = tafel * i;
                System.out.printf("%d x %d = %d\n", i, tafel, uitkomst);
            }
            System.out.print("Wil je nog een tafel zien? ");
            String keuze = sc.nextLine();
            if (keuze.equalsIgnoreCase("n") || keuze.equalsIgnoreCase("nee")) {
                System.out.println("Einde programma");
                loop = false;
            }
        }
    }
}

