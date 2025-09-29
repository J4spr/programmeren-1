package Week2;

import java.util.Scanner;

public class Belasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int btw;
        double price;
        System.out.print("Geef het btw percentage: ");
        btw = sc.nextInt();
        System.out.print("Geef je bedrag in euro in: ");
        price = sc.nextDouble();
        float btwInPercentage = (float) btw / 100;
        System.out.printf("%.2f = %.0f + %d", calculateExcludeBtw(price, btwInPercentage), price, btw);
    }

    static double calculateExcludeBtw(double price, double btwPercentage) {
        return price * (1 + ( float)btwPercentage / 100);
    }
}
