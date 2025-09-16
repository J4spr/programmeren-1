package Week1;

import java.util.Scanner;

public class StartToRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hartslagRust = 0, leeftijd;
        int hartslagMax = 0;

        System.out.print("Wat is je leeftijd? ");
        leeftijd = sc.nextInt();

        hartslagMax = 220 - leeftijd;

        System.out.print("Wat is je hartslag in rust? ");
        hartslagRust = sc.nextInt();

        int idealeHartslag = hartslagRust + (hartslagMax - hartslagRust);

        System.out.println("Wat voor training wil je doen?");
        System.out.println("1: recuperatie training\n2: LSD training (Long Slow Distance\n3: extensieve uithouding");
        System.out.println("4: intensieve uithouding\n5: tempo-interval\n6: intensieve interval");

        int keuze;
        System.out.print("Maak je keuze:");
        keuze = sc.nextInt();

        double traininghartslag = 0;
        switch (keuze) {
            case 1:
                traininghartslag = idealeHartslag * 0.65;
                break;
            case 2:
                traininghartslag = hartslagMax * 0.65;
                break;
            case 3:
                traininghartslag = hartslagMax * 0.70;
                break;
            case 4:
                traininghartslag = hartslagMax * 0.85;
                break;
            case 5:
                traininghartslag = hartslagMax * 0.9;
                break;
            case 6:
                traininghartslag = hartslagMax * 0.95;
                break;
            default:
                System.out.println("Geef een geldig getal in.");
                break;
        }
        System.out.printf("Je maximale hartslag is: %d\n", hartslagMax);
        System.out.printf("Je traint best met een hartslag van rond de %.0f", traininghartslag);
    }
}
