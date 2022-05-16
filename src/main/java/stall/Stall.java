package stall;

public abstract class Stall {
    protected String name;
    protected String ownersName;
    protected double rating;
    protected int parkingSpot;

    public Stall(String name, String ownersName, double rating, int parkingSpot) {
        this.name = name;
        this.ownersName = ownersName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public double getRating() {
        return rating;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
