import java.util.stream.Stream;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        // your code here
        return s.mapToInt(Integer::intValue).sum();
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        // your code here
        return s.mapToInt(num -> num/divider).sum();
    }
}