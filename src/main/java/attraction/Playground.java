package attraction;

import interfaces.IReviewed;
import interfaces.ISecurity;
import visitor.Visitor;

public class Playground extends Attraction implements IReviewed, ISecurity {

    public Playground(String name, double rating) {
        super(name, rating);
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 5;
    }
}
