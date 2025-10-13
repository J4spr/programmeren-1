package PeerTutoring;

import java.util.Scanner;

public class HartSlagZones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        int restingHr, hrr;
        System.out.print("Is je HRR gekend? ");
        input = sc.nextLine().charAt(0);
        if (!(input == 'J' || input == 'j')) {
            System.out.print("Is je hartslag in rust gekend? ");
            input = sc.nextLine().charAt(0);
            if (input == 'J' || input == 'j') {
                System.out.print("Geef je hartslag in rust in: ");
                restingHr = sc.nextInt();
            }
            System.out.println("Ga even zitten en adem 10 keer diep in en uit");
            System.out.print("Indien je klaar bent type je ok");
            sc.nextLine();
            countDown();
            System.out.print("Geef het aantal slagen in:");
            restingHr = (sc.nextInt()) * 4;
        } else {
            System.out.println("Geef deze dan in");
            hrr = sc.nextInt();
        }
        System.out.println();

    }

    static void countDown() {
        System.out.println("Start");
        for (int i = 0; i <= 15; i++) {
            System.out.printf("%d - ", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("stop");
    }

    static String idealHr(double min , double max,int rust,int hrr){
        int Limiet1 = (int) (hrr * min + rust);
        int Limiet2 = (int) (hrr * max + rust);
        return "Limieten hartslag: " + Limiet1 + " en " + Limiet2;
    }


}
