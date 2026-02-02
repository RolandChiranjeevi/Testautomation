package WeekTwo.Vehicle;

public class Bike2 extends Vehicle {
    private int currentGear = 1, maxGear;
    private int force;

    public  Bike2(int nbr) {
        this.maxGear = nbr;
    }
    public void changeGear(char operator) {
        if(operator == '+' && currentGear <maxGear) currentGear++;
        if(operator == '-' && currentGear>1) currentGear--;
        setSpeed((this.force*currentGear)/maxGear/20);
    }
    public void increaseSpeed(int force) {
        this.force += force;
        setSpeed(this.force*currentGear/maxGear/20);

    }
}
