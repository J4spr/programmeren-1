package Week6;

import java.util.Scanner;

public class StudentenCijfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Naam: ");
            String naam = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Cijfer: ");
            double cijfer = scanner.nextDouble();
            scanner.nextLine();
            Student student = new Student(naam, id, cijfer);

            while (!student.isCorrect()) {
                System.out.println("Ongeldige gegevens, probeer opnieuw.");
            }

            System.out.println("Resultaten!");
            System.out.println("Naam: " + student.getName());
            System.out.println("Prestatiecategorie: " + student.getPrestatieCategorie());

            System.out.print("Wil je nog een student invoeren? (ja/nee): ");
            String antwoord = scanner.nextLine();

            if (!antwoord.equalsIgnoreCase("ja")) {
                System.out.println("Tot de volgende, professor!");
                break;
            }

        } while (true);

    }
}

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCorrect() {
        boolean correct = true;
        if (this.name == null || this.name.trim().isEmpty())
            correct = false;

        if (this.id < 0)
            correct = false;

        if (this.grade < 0 || this.grade > 100)
            correct = false;
        return correct;
    }

    public String getPrestatieCategorie() {
        int categorie = (int) (this.grade / 10);
        return switch (categorie) {
            case 10, 9 -> "Excellent";
            case 8, 7 -> "Goed";
            case 6, 5 -> "Voldoende";
            default -> "Onvoldoende";
        };
    }

}
