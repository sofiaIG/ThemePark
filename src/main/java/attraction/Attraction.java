package attraction;

public abstract class Attraction {

    protected String name;
    protected double rating;
    protected int visitCount;

    public Attraction(String name, double rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
