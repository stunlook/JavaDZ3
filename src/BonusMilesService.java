public class BonusMilesService {
    public int calculate (int cost) {
        int result;
        if (cost < 0) {
            result = 0;
        } else {
            result = cost / 20;
        }
        return result;
    }
}
