package attraction;

import interfaces.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, double rating) {
        super(name, rating);
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }
}
