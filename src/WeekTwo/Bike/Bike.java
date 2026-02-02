package WeekTwo.Bike;

public class Bike {
    private int bikeSpeed;

    public int getNbrGears() {
        return nbrGears;
    }

    public Bike() {
        this.bikeSpeed=0;
    }

    public void setNbrGears(int nbrGears) {
        this.nbrGears = nbrGears;
    }

    public int getBikeSpeed() {
        return bikeSpeed;
    }

    public int inCreaseSpeed(int force, int nbrGears) {
        bikeSpeed = nbrGears*force/3;
        return bikeSpeed;
    }


    private int nbrGears;
}
