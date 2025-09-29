package PeerTutoring;

import java.util.ArrayList;
import java.util.Scanner;

public class Aankoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productCount = 3;
        ArrayList<Double> products = new ArrayList<>(productCount);

        while (true) {
            System.out.print("Geef een getal in: (en \"-1\" als je wilt stoppen): ");
            double val = sc.nextDouble();
            if (val == -1) break;
            if (isNegative(val)) {
                System.out.println("Ongeldige prijs, de prijs wordt op 0 gezet");
                val = 0;
            }
            products.add(val);
            System.out.printf("prijs incl BTW: %.1f\n", calculateBtw(val));
        }
        double totalPrice = 0;
        for (double num : products) {
            totalPrice += num;
        }
        if (totalPrice == 0) {
            System.out.println("U hebt geen producten gekocht");
        }
        if (totalPrice >= 100) {
            totalPrice += totalPrice * 0.10;
        }
        if (totalPrice >= 200) {
            System.out.println("U krijgt een extra geschenk!");
        }

        double discount = totalPrice * 0.1;

        System.out.printf("Korting toegepast: %.2f\nDe totale prijs is %.1f\n", discount, totalPrice);
        System.out.printf("De eindprijs is %.2f", totalPrice - discount);

    }

    static boolean isNegative(double price) {
        return (price <= 0 && price != -1);
    }

    static double calculateBtw(double price) {
        double btw = 1.21;
        return price * btw;
    }
}
