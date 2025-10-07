import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        // your code here
        if (s == null) {
            return false;
        }
        return Pattern.matches("[a-zA-Z]+", s);
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        // your code here
        if (s == null) {
            return false;
        }
        return Pattern.matches("^[a-zA-Z].*\\d$", s);
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        // your code here
        if (s == null) {
            return false;
        }
        return Pattern.matches(".*A{3,}.*", s);
    }
}