package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Geef een jaar op: ");
        year = sc.nextInt();
        if (calculateYear(year))
            System.out.printf("Het jaar %d is wel een schrikkeljaar", year);
        if (!calculateYear(year))
            System.out.printf("Het jaar %d is geen schrikkeljaar", year);

    }

    static boolean calculateYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;

    }

}
