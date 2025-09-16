package Week1;

import java.util.Scanner;

public class Reeksen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je afdrukken? ");
        int aantalGetallen = sc.nextInt();
        System.out.print("Met welke waarde wil je starten ");
        int startWaarde = sc.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        int verhogingsWaarde = sc.nextInt();
        int i = 0;
        int waarde = startWaarde;
        while (i < aantalGetallen) {
            System.out.printf("%d ", waarde);
            waarde += verhogingsWaarde;
            i++;
        }

    }
}
