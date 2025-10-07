
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        // your code here
        if (s == null) {
            return s;
        }
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");
    }
    
    public static String obfuscateEmail(String s) {
        // your code here
        if (s == null) {
            return s;
        }
        String[] parts = s.split("@");
        if (parts.length != 2) {
            return s;
        }
        
        String username = parts[0];
        Pattern pattern = Pattern.compile("(.*)(\\.|-|_)(.*)");
        Matcher matcher = pattern.matcher(username);
        if (matcher.matches()) {
            username = matcher.group(1) + matcher.group(2) + "*".repeat(matcher.group(3).length()) + "@";
        } else {
            if (username.length() > 3) {
                username = username.substring(0, 3) + "*".repeat(username.length() - 3) + "@";
            }
        }

        String[] domains = parts[1].split("\\.");
        // System.out.println(domains.length);
        if (domains.length == 3) {
            username += "*".repeat(domains[0].length())+"."+domains[1]+"."+"*".repeat(domains[2].length());
        } else if (domains.length == 2) {
            username += "*".repeat(domains[0].length());
            if (!(domains[1].equals("org") || domains[1].equals("com") || domains[1].equals("net"))) {
                username += "." + "*".repeat(domains[1].length());
            } else {
                username += "." + domains[1];
            }
        }


        return username;
    }
}
/*
32 et 50
32 cm et 50 €
32cms et 50€!
l lapin jou à la bel ball avec d animau rigolo pour gagner l bill bleu
john.***@*******.com
jan*@*******.co.***
jac***@*******.**
 */