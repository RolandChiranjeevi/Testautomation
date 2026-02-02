package main.CodingWithJohn;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>();

        empIds.put("John",12);
        empIds.put("Carl",23);

        System.out.println(empIds);

        System.out.println(empIds.get("John"));

        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsKey("Caro"));

        empIds.putIfAbsent("John",122);
    }
}
