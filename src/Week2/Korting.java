package Week2;

import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        int articleCount;
        System.out.print("Geef een bedrag op: ");
        total = sc.nextDouble();
        System.out.print("Geef het aantal artikelen: ");
        articleCount = sc.nextInt();
        if (total > 150 && (articleCount > 10 && articleCount < 20)) {
            System.out.println("De klant krijgt korting");

        } else if (articleCount > 150) {
            System.out.println("De klant krijgt korting");
        } else {
            System.out.println("De klant krijgt geen korting");
        }
    }
}
