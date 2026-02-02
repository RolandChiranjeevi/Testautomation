package WeekTwo.Animals;

public class Frog {
    private String name;
    private int age;

    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void behaviour(int nbrOfJumps, double length) {
        System.out.println(" Leaps "+nbrOfJumps*length+" meters");


    }

    public String getName() {
        return name;
    }
}
