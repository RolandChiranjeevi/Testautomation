package WeekTwo.Vehicle;

// 4 olika behörigheter
// Tomt - Gäller bara i packaget
// Private - gäller bara i klassen
// Public - gäller den överallt
// Protected - gäller inom samma package

public class Vehicle {
    private int speed;

    Vehicle() {
        this.speed=0;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
