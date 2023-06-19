public class BonusMilesService {
    /* Метод calculate */
    public int calculate(int cost) {

        int costForOneMile = 20;
        int miles;

        miles = cost / costForOneMile;

        return miles;
    }
}