package main.WeekThree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashish {
    public static void main(String[] args) {
        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("JT",38);
        nameAge.put("JE",36);
        nameAge.put("OT",2);
        nameAge.put("CT",71);
        nameAge.put("ME",66);


        System.out.println(nameAge);

        Scanner myScan = new Scanner(System.in);
        System.out.println(nameAge.keySet());
        System.out.println("Type the initials of the person you want to know the age of!");
        String name = myScan.nextLine();
        //for(name:nameAge.values()) {

        }



        //System.out.println(nameAge);


    }


