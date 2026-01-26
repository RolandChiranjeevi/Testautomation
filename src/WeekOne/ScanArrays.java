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

        while (!first) {
            try {
                System.out.print("Type in a number: ");
                numbers[0] = myScanner.nextInt();
                first = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}
        while (!second) {
            try {
                System.out.print("Type in a number: ");
                numbers[1] = myScanner.nextInt();
                second = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}
        while (!third) {
            try {
                System.out.print("Type in a number: ");
                numbers[2] = myScanner.nextInt();
                third = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}
        while (!fourth) {
            try {
                System.out.print("Type in a number: ");
                numbers[3] = myScanner.nextInt();
                fourth = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}
        while (!fifth) {
            try {
                System.out.print("Type in a number: ");
                numbers[4] = myScanner.nextInt();
                fifth = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}


        System.out.println(Arrays.toString(numbers));

    }
}
