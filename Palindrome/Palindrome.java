public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev.equals(s);
    }
}

// true
// false