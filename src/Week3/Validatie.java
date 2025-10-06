package Week3;

import java.util.Scanner;

public class Validatie {
    public static void main(String[] args) {
        int repeat = 5;
        int counter = 0;
        int average = 0;
        while (counter < repeat){
            counter++;
            int num = readNumber();
            average += num / repeat;
            System.out.println(average);
        }
    }
    static int readNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Geef een getal in: ");
        number = sc.nextInt();
        return number;
    }
}
