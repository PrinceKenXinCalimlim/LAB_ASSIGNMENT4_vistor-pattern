public class DistanceBasedShipping implements ShippingCost {
    private double totalCost = 0;
    private final double distance;

    public DistanceBasedShipping(double distance) {
        this.distance = distance;
    }

    @Override
    public double visit(RecliningChair recliningChair) {
        double cost = (15.0 + (recliningChair.getWeight() * 0.5)) * (distance / 100);
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + recliningChair.getName() + ": $" + cost);
        return cost;
    }

    @Override
    public double visit(PoolTable poolTable) {
        double cost = (poolTable.getWeight() * 0.7) * (distance / 100);
        if (poolTable.isAssembled()) {
            cost += 25.0;
        }
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + poolTable.getName() + ": $" + cost);
        return cost;
    }

    @Override
    public double visit(Sofa sofa) {
        double cost = (sofa.getVolume() * 0.05 + sofa.getWeight() * 0.6) * (distance / 100);
        if (sofa.getMaterial().equalsIgnoreCase("leather")) {
            cost += 50.0;
        }
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + sofa.getName() + ": $" + cost);
        return cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}