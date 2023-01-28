public class BonusMilesService {
    public int calculate(int a){
        int cost;
        if (a > 0){
            cost = (a / 20);
        }else {
            cost = a;
        }return cost;
    }
}
