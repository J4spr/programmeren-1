package Week1;

import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jaar = LocalDate.now().getYear();

        System.out.print("wat is je naam? ");
        String naam = sc.nextLine();

        System.out.print("Beste " + naam + " geef je geboortejaar ");
        int geboortejaar = sc.nextInt();

        int leeftijd = jaar - geboortejaar;
        System.out.println("Volgens mijn berekeningen ben je " + leeftijd + " jaar oud");

    }
}
