package Week3;

import java.util.Scanner;

public class Konijnen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Aantal maanden:");
        n = sc.nextInt();
        System.out.printf("Na %d maanden heb je %d konijnen\n", n, fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
