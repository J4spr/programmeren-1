package PeerTutoring.Galgje;

import java.util.Scanner;

public class Galgje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.print("Geef een woord in: ");
            s = sc.nextLine();
        } while (s.length() < 5 || s.length() > 10);

        for (int i = 0; i < 20; i++) {
            System.out.print("\n");
        }

        for (int i = 0; i <= s.length(); i++) {
            System.out.print(".");
        }

    }

}
