package WeekOne;

//Läs in två tal och beräkna kvoten
//Fånga fel och skriv ut felmeddelande
// Uppdatera så att meddelande i exception

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDivisionCatch {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        boolean firstOk = false;
        boolean secondOk = false;
        Scanner myScanner = new Scanner(System.in);
        while (!firstOk) {
            try {
                System.out.print("Type in a number: ");
                numberOne = myScanner.nextInt();
                firstOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only please!");
                System.out.print("Enter a new number: ");
                myScanner.nextInt();
                System.out.println(e.getMessage());
                System.out.println(e);
            }}
            while (!secondOk) {
                try {
                    System.out.print("Type in another number: ");
                    numberTwo = myScanner.nextInt();
                    secondOk = true;
                } catch (InputMismatchException e) {
                    System.out.println("Enter whole numbers only please!");
                    System.out.print("Enter a new number: ");
                    myScanner.nextInt();
                    System.out.println(e.getMessage());
                    System.out.println(e);
                }}

            try {    double division = numberOne / numberTwo;
                System.out.println("Result: " + division);
            }
            catch (ArithmeticException e) {
                System.out.println("Oi, stupid. You can't divide by zero!");
                //System.out.println(e.getMessage());
                //System.out.println(e);
            }

        }
    }


