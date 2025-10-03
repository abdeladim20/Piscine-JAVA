import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || value == null) {
            return null;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (value.equals(list.get(i))) {
                return i;
            }
        }
        return null;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null || value == null) {
            return null;
        }
        int index = list.indexOf(value);
        return index == -1 ? null : index;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> indexes = new ArrayList<>();
        if (list == null || value == null) {
            return indexes;
        }
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}