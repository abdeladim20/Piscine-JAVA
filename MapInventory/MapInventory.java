
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {

    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here
        if (inventory.containsKey(productId)) {
            return inventory.get(productId);
        } else {
            return -1;
        }
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> matchingProductIds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == price) {
                matchingProductIds.add(entry.getKey());
            }
        }
        return matchingProductIds;
    }
}

/*

50
50
-1
[P002, P004]
[P003, P005]
[]
 */
