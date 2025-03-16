public class RecliningChair implements Furniture {
    private String name;
    private double weight;
    private boolean hasMotor;

    public RecliningChair(String name, double weight, boolean hasMotor) {
        this.name = name;
        this.weight = weight;
        this.hasMotor = hasMotor;
    }

    public double getWeight() {
        return weight;
    }

    public boolean hasMotor() {
        return hasMotor;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visit(this);
    }
}