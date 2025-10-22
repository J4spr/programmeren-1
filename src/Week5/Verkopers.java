package Week5;

import java.util.Scanner;

public class Verkopers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de omzet van de eerste verkoper: ");
        double revenue = scanner.nextDouble();
        SalesPerson viktor = new SalesPerson("Viktor", revenue);

        System.out.print("Geef de omzet van de tweede verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson tine = new SalesPerson("Tine", revenue);

        System.out.print("Geef de omzet van de derde verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson kubra = new SalesPerson("Kubra", revenue);

        double maxRevenue = Math.max(tine.getRevenue(), Math.max(viktor.getRevenue(), kubra.getRevenue()));
        System.out.printf("De beste verkoper is Kubra met een omzet van €%.2f", maxRevenue);
    }
}

class SalesPerson {
    String name;
    double revenue;

    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public String getName() {
        return this.name;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public boolean generatesMoreRevenueThan(SalesPerson otherPerson) {
        return (this.revenue > otherPerson.getRevenue());

    }

    @Override
    public String toString() {
        return String.format("%s heeft een revenue van %.2f", this.name, this.revenue);
    }

}
