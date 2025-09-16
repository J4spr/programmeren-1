package Week1;

import java.util.Scanner;

public class Tafels2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tafel;
        int antwoord = 0;
        boolean loop = true;
        int fouten = 0;
        while (loop) {
            System.out.print("Welke tafel wil je krijgen? ");
            tafel = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < 11; i++) {
                int uitkomst = tafel * i;
                System.out.printf("%d x %d = ", i, tafel);
                antwoord = sc.nextInt();
                if (antwoord != uitkomst) {
                    fouten++;
                    i--;
                    System.out.println("Probeer opnieuw");
                }
            }
            System.out.printf("Je had er %d fout\n", fouten);
            sc.nextLine();
            System.out.print("Wil je nog een tafel zien? ");
            String keuze = sc.nextLine();
            if (keuze.equalsIgnoreCase("n") || keuze.equalsIgnoreCase("nee")) {
                System.out.println("Einde programma");
                loop = false;
            }
        }
    }
}

