package Week1;

import java.util.Scanner;

public class Begroeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wat is naam? ");
        String naam = sc.nextLine();
        System.out.println("Hallo " + naam);

    }
}
