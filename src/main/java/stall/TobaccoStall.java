package stall;

import interfaces.IReviewed;
import interfaces.ISecurity;
import visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {


    public TobaccoStall(String name, String ownersName, double rating, int parkingSpot) {
        super(name, ownersName, rating, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge()>=18;
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }
}
