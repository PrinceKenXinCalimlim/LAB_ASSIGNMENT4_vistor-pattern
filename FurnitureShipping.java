public class FurnitureShipping {
    public static void main(String[] args) {
        Furniture recliningChair = new RecliningChair("Luxury Reclining Chair", 50, false);
        Furniture poolTable = new PoolTable("Professional Pool Table", 200, true);
        Furniture sofa = new Sofa("Modern Sofa", 10, 1.2, "fabric");

        Furniture[] shoppingCart = {recliningChair, poolTable, sofa};

        System.out.println("\nStandard Shipping\n");
        StandardShipping standardShipping = new StandardShipping();
        for (Furniture item : shoppingCart) {
            item.accept(standardShipping);
        }
        System.out.println("\nTotal standard shipping cost: $" + standardShipping.getTotalCost());

        System.out.println("\nDistance-Based Shipping\n");
        DistanceBasedShipping distanceShipping = new DistanceBasedShipping(300);
        for (Furniture item : shoppingCart) {
            item.accept(distanceShipping);
        }
        System.out.println("\nTotal distance-based shipping cost: $" + distanceShipping.getTotalCost());
    }
}