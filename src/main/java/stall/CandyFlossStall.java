package stall;

import interfaces.IReviewed;

public class CandyFlossStall extends Stall implements IReviewed {

    public CandyFlossStall(String name, String ownersName, double rating, int parkingSpot) {
        super(name, ownersName, rating, parkingSpot);
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }
}
