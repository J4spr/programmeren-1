package Week3;

import java.util.Scanner;

public class Kerstboom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef de breedte van de boom (13..29, oneven): ");
        int width = sc.nextInt();


        if (width < 13 || width > 29 || width % 2 == 0) {
            width = 13;
        }

        int middle = width / 2;


        for (int i = 0; i <= middle; i++) {
            for (int j = 0; j < middle - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 0; k < 4; k++) {
            for (int j = 0; j < middle - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
/*
public class Kerstboom {
    public static void main(String[] args) {
        int min = 13;
        int max = 29;
        int middle;
        for (int i = max; i > min; i--) {
            middle = (i + max) / 2;
            for (int j = max; j < (middle * 2); j++) {
                if (j % 13 == 0) {
                    System.out.print("\n");
                }
                System.out.print("*");
            }
        }
        for (int k = 0; k < 4; k++) {
            System.out.println("***");
        }
    }
}
 */