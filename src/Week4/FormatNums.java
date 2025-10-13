package Week4;

import java.util.Scanner;

public class FormatNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Geef een getal in: ");
        s = sc.nextLine();
        System.out.printf("%s", formatNums(s));
    }

    static StringBuilder formatNums(String s) {
        StringBuilder formattedNums = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            formattedNums.append(s.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                formattedNums.append(' ');
            }
        }

        return formattedNums.reverse();
    }

}
