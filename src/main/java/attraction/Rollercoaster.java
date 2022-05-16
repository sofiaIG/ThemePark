package attraction;

import interfaces.IReviewed;
import interfaces.ISecurity;
import interfaces.ITicketed;
import visitor.Visitor;

public class Rollercoaster extends Attraction implements IReviewed, ISecurity, ITicketed {

    public Rollercoaster(String name, double rating) {
        super(name, rating);
    }

    public double getRating() {
        return this.rating;
    }


    public String getName() {
        return name;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge()<12 && visitor.getHeight()>= 1.45;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()>2.00){
            return 16.80;
        }else{
            return 8.40;
        }
    }
}
