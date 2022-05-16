package stall;

import interfaces.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {
    public IceCreamStall(String name, String ownersName, double rating, int parkingSpot) {
        super(name, ownersName, rating, parkingSpot);
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }
}
