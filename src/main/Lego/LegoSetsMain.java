package main.Lego;
import java.util.ArrayList;

public class LegoSetsMain {
    public static void main(String[] args) {
        ArrayList <String> legoSets= new ArrayList<>();

        legoSets.add("Bugatti");
        legoSets.add("Bronco");
        legoSets.add("RedbullF1");

        System.out.println(legoSets);

        for (String car : legoSets) {
            System.out.println(car);
        }

    }


}
