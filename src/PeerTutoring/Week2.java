package PeerTutoring;

import java.util.ArrayList;
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
//        System.out.printf("Dit is de prijs met btw: %.2f", calculateBtw(100));
        Scanner sc = new Scanner(System.in);
        int productCount = 3;
        double product1, product2, product3;
        ArrayList<Double> products = new ArrayList<>(productCount);

        System.out.print("Wat is de prijs van het 1ste product:");
        product1 = sc.nextDouble();
        System.out.print("Wat is de prijs van het 2de product: ");
        product2 = sc.nextDouble();
        System.out.print("Wat is de prijs van het 3de product: ");
        product3 = sc.nextDouble();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        double totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            if (isNegative(products.get(i)))
                products.set(i, (double) 0);
            products.set(i, calculateBtw(products.get(i)));
            System.out.printf("Dit is de prijs met btw: %.2f\n", calculateBtw(products.get(i)));
            totalPrice += products.get(i);
        }
        System.out.printf("De totale prijs is %.2f", totalPrice);
    }

    static boolean isNegative(double price) {
        return price >= 0;
    }

    static double calculateBtw(double price) {
        double btw = 0.21;
        return price + (price * btw);
    }
}
