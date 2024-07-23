package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck() {
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public Truck setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
