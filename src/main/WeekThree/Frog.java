package main.WeekThree;

public class Frog extends Animal{
    private String name;

    public Frog (String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public void jump() {
        System.out.println("The frog jumps!");
    }
}
