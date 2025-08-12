package Recursion;

class Panlin {
    public boolean palindromecheck(String s) {
        return ispalindromecheck(s, 0, s.length() - 1);
    }

    private boolean ispalindromecheck(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return ispalindromecheck(s, left + 1, right - 1);
    }

}

public class StringPanlindrome {
    public static void main(String[] args) {
        Panlin panlindrom = new Panlin();
        System.out.println(panlindrom.palindromecheck("madam"));
        System.out.println(panlindrom.palindromecheck("racecar"));
        System.out.println(panlindrom.palindromecheck("jeeva"));
    }
}
