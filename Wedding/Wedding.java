import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> couples = new HashMap<>();

        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

        Collections.shuffle(secondList);

        int numberOfCouples = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < numberOfCouples; i++) {
            couples.put(firstList.get(i), secondList.get(i));
        }

        return couples;
    }
}