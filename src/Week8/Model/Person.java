package Week8.Model;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){
        this("nobody");
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}


