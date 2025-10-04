
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        List<Integer> list2 = new ArrayList<Integer>(list);
        list2.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        return list2;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        List<Integer> list2 = new ArrayList<Integer>(list);
        list2.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return list2;
    }
}

/*
[-1, 1, 12, 14, 14, 15, 18, 54, 98]
[98, 54, 18, 15, 14, 14, 12, 1, -1]
 */
