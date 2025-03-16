public class PoolTable implements Furniture {
    private String name;
    private double weight;
    private boolean assembled;

    public PoolTable(String name, double weight, boolean assembled) {
        this.name = name;
        this.weight = weight;
        this.assembled = assembled;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isAssembled() {
        return assembled;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visit(this);
    }
}
