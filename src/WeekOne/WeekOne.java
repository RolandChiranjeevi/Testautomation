package WeekOne;

import java.util.Arrays;
import java.util.Scanner;

public class WeekOne {
    public static void main(String[] args) {
        try {
            String[] names = {"Ada", "Beda", "Cålle"};

            Scanner myScan = new Scanner(System.in);
            int index = myScan.nextInt();

            System.out.println(names[index]);
        } catch ( Exception e) {
            System.out.println("Körv");
            System.out.println(e.getMessage());
            System.out.println(e);
        }



    }
}
