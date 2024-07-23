package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;
    private double armLength;

    public Excavator() {
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public Excavator setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
        return this;
    }

    public double getArmLength() {
        return armLength;
    }

    public Excavator setArmLength(double armLength) {
        this.armLength = armLength;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
