package strings;

public class Reverse {
	public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String inputString = "String";
        String reversedString = reverseString(inputString);
        System.out.println("Original: " + inputString);
        System.out.println("Reversed: " + reversedString);
    }
}
