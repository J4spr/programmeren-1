package Week8.Model;

public class TestModel {
    public static void main(String[] args) {
        Model firstModel = new Model("Caroline");
        System.out.println("\nEerste Model");
        System.out.println(firstModel);

        Model secondModel = new Model("Veronica", 102, 67, 88);
        secondModel.setAddress("NationaleStraat 5", "2000");
        System.out.println("\nTweede model:");
        System.out.println(secondModel);
    }
}
