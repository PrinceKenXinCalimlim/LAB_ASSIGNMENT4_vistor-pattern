public class StandardShipping implements ShippingCost {
    private double totalCost = 0;

    @Override
    public double visit(RecliningChair recliningChair) {
        double cost = 15.0 + (recliningChair.getWeight() * 0.5);
        totalCost += cost;
        System.out.println("Standard shipping cost for " + recliningChair.getName() + ": $" + cost);
        return cost;
    }

    @Override
    public double visit(PoolTable poolTable) {
        double cost = poolTable.getWeight() * 0.7;
        if (poolTable.isAssembled()) {
            cost += 25.0;
        }
        totalCost += cost;
        System.out.println("Standard shipping cost for " + poolTable.getName() + ": $" + cost);
        return cost;
    }

    @Override
    public double visit(Sofa sofa) {
        double cost = sofa.getVolume() * 0.05 + sofa.getWeight() * 0.6;
        if (sofa.getMaterial().equalsIgnoreCase("leather")) {
            cost += 50.0;
        }
        totalCost += cost;
        System.out.println("Standard shipping cost for " + sofa.getName() + ": $" + cost);
        return cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
