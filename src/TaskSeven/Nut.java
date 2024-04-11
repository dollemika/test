package TaskSeven;

public class Nut {
    private double weight;

    public Nut() {
        double r = (25 - 5) + 1;
        this.weight = Math.random()*r+5;
    }

    public double getWeight() {
        return weight;
    }
}
