package Week2;

import java.util.Scanner;

public class Talstelsels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, talstelsel;
        System.out.print("Geef een getal in: ");
        number = sc.nextInt();
        System.out.print("Geef een talstelsel in: ");
        talstelsel = sc.nextInt();
        System.out.println(giveTalstelsel(number, talstelsel));
    }
    static int giveTalstelsel(int number, int deler) {
        return 0;
    }
}
