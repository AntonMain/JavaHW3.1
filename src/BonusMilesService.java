public class BonusMilesService {
    public int calculate(int totalMiles) {
        int cost;
        if (totalMiles > 0) {
            cost = (totalMiles / 20);
        } else {
            cost = totalMiles;
        }
        return cost;
    }
}
