package WeekTwo.Animals;

import java.util.Scanner;

public class AnimalsMain {
    public static void main(String[] args) {
        //Scanner myScanner = new Scanner(System.in);
        //System.out.println("What is the name of your frog? ");
        //name = myScanner.nextLine();


        //Frog frogThree = new Frog(name(),age());
        Frog frogOne = new Frog(name(),age());
        Frog frogTwo = new Frog(name(),age());
        //Dog dogOne = new Dog (name(),age());

        //System.out.println(dogOne.getName());
        //dogOne.behaviour();

        System.out.print(frogOne.getName());
        frogOne.behaviour(nbrOfJumps(),length());

        System.out.print(frogTwo.getName());
        frogTwo.behaviour(nbrOfJumps(),length());



    }
    private static String name() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's your name of the frog? ");
        return myScanner.nextLine();
    }
    private static int age() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old is the little fucker? ");
        boolean ageBreak = false;
        int ageInt=0;
        while(!ageBreak) {
            try {
                ageInt = Integer.parseInt(myScanner.nextLine());
                ageBreak = true;
            } catch (Exception e) {
                System.out.println("Age must be a whole number!");
            }
        }
        return 0;
    }
    private static int nbrOfJumps() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many jumps does the do? ");
        try {
            return Integer.parseInt((myScanner.nextLine()));

        } catch(Exception e) {
            System.out.println("Something was wrong, probably not a number!");
        } return 0;
    }
    private static double length() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nice! But how long, on average, does the jump?");
        return Double.parseDouble((myScanner.nextLine()));
    }
}
