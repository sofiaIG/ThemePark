package attraction;


import interfaces.IReviewed;
import interfaces.ITicketed;
import visitor.Visitor;

import java.util.function.IntToDoubleFunction;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, double rating) {
        super(name, rating);
    }


    public double getRating() {
        return this.rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge()<12){
            return 2.25;
        }else{
            return 4.50;
        }
    }
}
