package WeekTwo.Vehicle;

public class Car extends Vehicle{
    public void increaseSpeed(int increment) {
        setSpeed(getSpeed()+ increment);
    }

}
