package main.WeekThree;

public class Dog extends Animal{

    private String name;

    public Dog (String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("The dog is called: "+name);
    }

    public void jump() {
        System.out.println("The dog jumps!");
    }
}

