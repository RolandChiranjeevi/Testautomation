package WeekTwo.Animals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void behaviour() {
        System.out.println("Bark");
    }

    public String getName() {
        return name;
    }
}
