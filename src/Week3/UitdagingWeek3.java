package Week3;

import java.util.Scanner;

public class UitdagingWeek3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 6;
        String answer;
        int total = 0;
        int randomNum = 0;
        while (true) {
            System.out.print("Wil je een keer gooien met de dobbelsteen?");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("nee"))
                break;
            if (answer.equalsIgnoreCase("ja")) {
                randomNum = generateRandomNumber(min, max);
                System.out.printf("je nummer is %d\n", randomNum);
                total += randomNum;
            }
        }
        System.out.printf("Je totaal is %d", randomNum);
    }

    static int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min) + 1);
    }
}
