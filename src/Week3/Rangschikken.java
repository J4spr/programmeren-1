package Week3;

import java.util.Scanner;

public class Rangschikken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Geef een getal in: ");
        num = sc.nextInt();
        System.out.printf("Als je %d voorwerpen hebt, dan kan je deze sorteren op %d manieren\n",num, fact(num));
    }

    static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
