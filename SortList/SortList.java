
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> list2 = new ArrayList<>(list);
        list2.sort(Comparator.naturalOrder());
        return list2;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> list2 = new ArrayList<>(list);
        list2.sort(Comparator.reverseOrder());
        return list2;
    }
}