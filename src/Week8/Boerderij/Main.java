package Week8.Boerderij;


public class Main {
    public static void main(String[] args) {
        Rabbit bugs = new Rabbit("Bugs", true);
        Cow belle = new Cow("Belle", 15.4);
        Rabbit bunny = new Rabbit("Bunny", false);
        Chicken kiekens = new Chicken("Generaal Kiekens", 3);
        Chicken chick = new Chicken("Chick", 4);
        Cow hannibal = new Cow("Hannibal", 3.2);

        // vul aan...
        System.out.println(bugs.toString());
        System.out.println(belle.toString());
        System.out.println(bunny.toString());
        System.out.println(kiekens.toString());
        System.out.println(chick.toString());
        System.out.println(hannibal.toString());
    }
}