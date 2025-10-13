package Week4;

import java.util.Scanner;

public class SmartLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light keukenLight = new Light();
        Light livingLight = new Light();
        Light slaapKamerLight = new Light();
        int keuze = 0;

        while (keuze != 5) {
            System.out.print("\n\nwat wil je doen?\n1 alle Lighten aan\2 alle Lighten uit\n3  Living en keuken aan (slaapkamer gaat uit)\n4  Slaapkamer aan (living en keuken gaan uit)\n5  Stoppen\njouw keuze: ");
            keuze = scanner.nextInt();

            if (keuze > 5) {
                System.out.println("Keuze niet in lijst, geef nieuwe keuze: ");
                keuze = scanner.nextInt();

            } else {
                switch (keuze) {
                    case 1 -> {
                        keukenLight.setLightAan();
                        livingLight.setLightAan();
                        slaapKamerLight.setLightAan();
                        System.out.println("-Light living: " + livingLight.getLightStatus() + "\n-Light keuken: " + keukenLight.getLightStatus() + "\n-Light slaapkamer: " + slaapKamerLight.getLightStatus());
                    }
                    case 2 -> {
                        keukenLight.setLightUit();
                        livingLight.setLightUit();
                        slaapKamerLight.setLightUit();
                        System.out.println("-Light living: " + livingLight.getLightStatus() + "\n-Light keuken: " + keukenLight.getLightStatus() + "\n-Light slaapkamer: " + slaapKamerLight.getLightStatus());
                    }
                    case 3 -> {
                        keukenLight.setLightAan();
                        livingLight.setLightAan();
                        slaapKamerLight.setLightUit();
                        System.out.println("-Light living: " + livingLight.getLightStatus() + "\n-Light keuken: " + keukenLight.getLightStatus() + "\n-Light slaapkamer: " + slaapKamerLight.getLightStatus());
                    }
                    case 4 -> {
                        keukenLight.setLightUit();
                        livingLight.setLightUit();
                        slaapKamerLight.setLightAan();
                        System.out.println("-Light living: " + livingLight.getLightStatus() + "\n-Light keuken: " + keukenLight.getLightStatus() + "\n-Light slaapkamer: " + slaapKamerLight.getLightStatus());
                    }
                }
            }
        }
    }
}

class Light {
    private String state;

    public void setLightAan() {
        this.state = "aan";
    }

    public void setLightUit() {
        this.state = "uit";
    }

    public String getLightStatus() {
        return this.state;
    }


}
