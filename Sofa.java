public class Sofa implements Furniture {
    private String name;
    private double weight;
    private double volume;
    private String material;

    public Sofa(String name, double weight, double volume, String material) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ShippingCost visitor) {
        visitor.visit(this);
    }
}