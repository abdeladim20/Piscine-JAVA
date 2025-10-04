import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KeepTheChange {

    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> change = new ArrayList<>();

        List<Integer> sortedCoins = coins.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int coin : sortedCoins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }

        return change;
    }
}