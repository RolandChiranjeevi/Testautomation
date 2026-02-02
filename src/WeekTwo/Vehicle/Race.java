package WeekTwo.Vehicle;

import WeekTwo.Bike.Bike;

public class Race {
    public static void main(String[] args) {
        Car myBronco = new Car();
        Car myBugatti = new Car();
        Bike2 myBike = new Bike2(7);


       myBike.increaseSpeed(200);
        myBronco.increaseSpeed(10);
        myBugatti.increaseSpeed(15);
        myBronco.increaseSpeed(53);
        myBugatti.increaseSpeed(49);
        System.out.println(myBronco.getSpeed());
        System.out.println(myBugatti.getSpeed());
        System.out.println(myBike.getSpeed());
        myBike.changeGear('+');
        System.out.println(myBike.getSpeed());
        myBike.changeGear('+');
        System.out.println(myBike.getSpeed());
        myBike.changeGear('+');
        System.out.println(myBike.getSpeed());

    }
}
