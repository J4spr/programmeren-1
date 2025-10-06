package Week3;

import java.util.Scanner;

public class Sinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period, amp;
        String space= " ";

        System.out.print("Geef de periode: ");
        period = sc.nextInt();
        System.out.print("Geef de amplitude: ");
        amp = sc.nextInt();


        int position;
        for (int i = 0; i < period * 3; i++) {
            position = (int) (Math.sin(i * 2 * Math.PI / period) * amp + amp);
            System.out.println(space.repeat(position)+"*");
        }
    }
}
