public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
        if (s == null) {
            return false;
        }
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev.toLowerCase().equals(s.toLowerCase());
    }
}

// true
// false