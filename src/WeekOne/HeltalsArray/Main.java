package WeekOne.HeltalsArray;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        HeltalsArray myArr = new HeltalsArray();
    int val = 0;


        while (val!=3) {
            System.out.println("Do you want to add a new number, press 1");
            System.out.println("Do you want to look at a specific index press 2.");
            System.out.println("Do you want stop type 3.");
            val = myScan.nextInt();
        if (val ==1) {
            System.out.println("Which number do you want to add?");
            int tal = myScan.nextInt();
            myArr.add(tal);
        }
        if (val == 2){
            System.out.println("Which index do you want to look at?");
            int index = myScan.nextInt();
            System.out.println(myArr.getValue(index));
        }
        if (val==3) {
            break;
        }
    }}
}
