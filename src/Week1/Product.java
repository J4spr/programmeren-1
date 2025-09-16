package Week1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int getal1 = scanner.nextInt();

        System.out.print("Geef nog een getal: ");
        int getal2 = scanner.nextInt();

        System.out.print("Geef een laatste getal: ");
        int getal3 = scanner.nextInt();

        int product = getal1 * getal2 * getal3;
        System.out.println("The product is: " + product);
    }
}
 