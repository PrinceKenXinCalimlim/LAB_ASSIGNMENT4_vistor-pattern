import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator implements ShippingCost {
    private static final Map<String, Integer> baseShippingMap = new HashMap<>();

    static {
        baseShippingMap.put("recliningChair", 20);
        baseShippingMap.put("poolTable", 30);
        baseShippingMap.put("sofa", 60);
    }

    @Override
    public double visit(RecliningChair recliningChair) {
        return baseShippingMap.get("recliningChair") + (recliningChair.getWeight() * 0.8);
    }

    @Override
    public double visit(PoolTable poolTable) {
        return baseShippingMap.get("poolTable") + (poolTable.getWeight() * 0.2);
    }

    @Override
    public double visit(Sofa sofa) {
        return baseShippingMap.get("sofa") + (sofa.getVolume() * 6);
    }
}
