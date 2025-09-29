package Week2;

import java.util.Scanner;

public class Investering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int headSum, years, yearlyPercentage;
        System.out.print("Wat is de hoofdsom? ");
        headSum = sc.nextInt();
        System.out.print("Wat is het jaarlijkse rente percentage? ");
        yearlyPercentage = sc.nextInt();
        System.out.print("Hoeveel jaren wil je dit vasthouden? ");
        years = sc.nextInt();
        System.out.printf("Het eindsaldo is %d", calculateTotal(headSum, yearlyPercentage, years));
    }

    public static int calculateTotal(int headSum, int percentage, int years) {
        return headSum * (1 + percentage / 100) ^ years;
    }
}
