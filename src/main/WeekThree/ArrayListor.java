package main.WeekThree;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;

public class ArrayListor {
   private static Map<String, Double> MATH_DEC = new LinkedHashMap<>();
    static{
        MATH_DEC.put("pi",3.1415926535);
        MATH_DEC.put("e",2.7182818284);
        MATH_DEC.put("sqrt2",1.4142135623);
        MATH_DEC.put("phi",1.6180339887);
        MATH_DEC.put("ln10",2.3025850929);
    }
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(3.1415926535);
        list.add(2.7182818284);
        list.add(1.4);

        //System.out.println(list.get(1));

        ArrayList<String> text = new ArrayList<>();
        text.add("pi");
        text.add("e");
        text.add("sqrt2");

        System.out.println(MATH_DEC);

        for(int i=0; i <list.size();i++) {
            System.out.println(list.get(i));
        }

        for(double value : list) {
            System.out.println(value);
        }

        System.out.println(MATH_DEC);

        for (String key : MATH_DEC.keySet()) {
            double value = MATH_DEC.get(key);
            System.out.println(key +" "+value);
        }
    }




}
