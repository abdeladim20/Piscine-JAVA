import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code here
        return s.filter(words -> !words.isEmpty())
                .collect(Collectors.groupingBy(words -> Character.toUpperCase(words.charAt(0))));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        // your code here
        return s.collect(Collectors.groupingBy(
            n -> n % 4,
            Collectors.maxBy(Integer::compare)
        ));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here
        return s.sorted().collect(Collectors.joining(" # ", "##{", "}"));
    }
}

/*
* {B=[Bonjour, bonsoir], L=[le], M=[monde !]}
* {0=Optional[424], 1=Optional[97], 2=Optional[48354], 3=Optional[5843]}
* ##{Bordeaux # Hello # how are you ? # where do you live ?}
 */
