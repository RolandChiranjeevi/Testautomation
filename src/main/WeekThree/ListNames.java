package main.WeekThree;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNames {
    public static void main(String[] args) {

        boolean runTilStop = false;
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while(!runTilStop) {
            System.out.println("Type your name");
            String name = myScanner.nextLine();
            if(name.equalsIgnoreCase("stop")) {
                break;
            }
            if (names.isEmpty()) {
                names.add(name);
                System.out.println("This your name? "+name);
            } else {
                names.set(0,name);
                System.out.println("This your name? "+name);
            }



            }
        }
        }




