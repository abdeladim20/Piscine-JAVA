import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        // your code here
        return s.mapToInt(String::length).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // your code here
        return s.map( words -> words.toUpperCase()).toList();
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
        return s.filter(n -> n > 42).map(num -> (int)Math.floor(num)).collect(Collectors.toSet());
    }
}