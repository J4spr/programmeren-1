package Week1;

import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double uitgavenQuinten;
        double uitgavenYousra;

        System.out.print("Hoeveel heeft Quinten uitgegeven? ");
        uitgavenQuinten = Double.parseDouble(sc.nextLine());

        System.out.print("Hoeveel heeft Yousra uitgegeven? ");
        uitgavenYousra = Double.parseDouble(sc.nextLine());

        double totaleUitgaven = uitgavenQuinten + uitgavenYousra;

        System.out.printf("In totaal werd er €%.2f uitgegeven \n", totaleUitgaven);

        double schulden = totaleUitgaven / 2;

        if (uitgavenQuinten > uitgavenYousra) {
            System.out.printf("Yousra moet %.2f betalen aan Quinten", schulden);
        }
        if (uitgavenYousra > uitgavenQuinten) {
            System.out.printf("Quinten moet %.2f betalen aan Yousra", schulden);
        }


    }
}
