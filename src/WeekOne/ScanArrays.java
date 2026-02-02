package WeekOne;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanArrays {
    public static void main(String[] args) {
        int[] numbers =new int [5];
        Scanner myScanner = new Scanner(System.in);
        boolean first = false;
        boolean second = false;
        boolean third = false;
        boolean fourth = false;
        boolean fifth = false;
        int inputMismatchCount = 0;
        int arrayIndexCount = 0;

        while(true) {
            System.out.println("Type in a whole number or type 'Stop' to close program.");
            System.out.print("Type 'Ok' if you understand!: ");
            String stop = myScanner.nextLine();
            if (stop.equalsIgnoreCase("stop")) {
                break;
            }

        while (!first) {
            try {
                System.out.print("Type in a number: ");
                String line = myScanner.nextLine();
                numbers[0] = Integer.parseInt(line);
                first = true;
            } catch (NumberFormatException e) {
                inputMismatchCount++;
                System.out.println("Enter whole numbers only please!");

            }}
        while (!second) {
            try {
                System.out.print("Type in a number: ");
                String line = myScanner.nextLine();
                numbers[1] = Integer.parseInt(line);
                second = true;
            } catch (NumberFormatException e) {
                inputMismatchCount++;
                System.out.println("Enter whole numbers only please!");
            }}
        while (!third) {
            try {
                System.out.print("Type in a number: ");
                String line = myScanner.nextLine();
                numbers[2] = Integer.parseInt(line);
                third = true;
            } catch (NumberFormatException e) {
                inputMismatchCount++;
                System.out.println("Enter whole numbers only please!");

            }}
        while (!fourth) {
            try {
                System.out.print("Type in a number: ");
                String line = myScanner.nextLine();
                numbers[3] = Integer.parseInt(line);
                fourth = true;
            } catch (NumberFormatException e) {
                inputMismatchCount++;
                System.out.println("Enter whole numbers only please!");

            }}
        while (!fifth) {
            try {
                System.out.print("Type in a number: ");
                String line = myScanner.nextLine();
                numbers[4] = Integer.parseInt(line);
                fifth = true;
            } catch (NumberFormatException e) {
                inputMismatchCount++;
                System.out.println("Enter whole numbers only please!");

            }}

        try {
            System.out.print("Enter an index between 1-5: ");
            String line = myScanner.nextLine();
            int i = Integer.parseInt(line);
            int index = i -1;
            System.out.println(numbers[index]);

        } catch (NumberFormatException e) {
            inputMismatchCount++;
            System.out.println("Enter a whole number for index please!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            arrayIndexCount++;
            System.out.println("You've entered an index that is not available.");
            }}
        System.out.println("You typed the wrong kind of number this many times: "+inputMismatchCount);
        System.out.println("You typed in the wrong index this many times: "+arrayIndexCount);
        double stupidScale = inputMismatchCount*arrayIndexCount+1000*10/42;
        System.out.println("You are this stupid on the scale: "+stupidScale);
    }
}
