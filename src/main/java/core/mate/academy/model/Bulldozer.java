package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double weight;

    public Bulldozer() {
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public Bulldozer setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Bulldozer setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
