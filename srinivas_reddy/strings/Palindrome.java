package strings;

public class Palindrome {
	public static boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man 2 @-";
        if (isPalindrome(str))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
