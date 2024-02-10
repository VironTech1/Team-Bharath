package strings;

public class Password {
	public static boolean isStrongPassword(String password) {
        if (password.length() < 8)
            return false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUppercase = true;
            else if (Character.isLowerCase(ch))
                hasLowercase = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else if ("!@#$%^&*()-_+=[]{}|;:,.<>?".indexOf(ch) != -1)
                hasSpecialChar = true;
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
    public static void main(String[] args) {
        String password = "StrongPassword123!45";
        if (isStrongPassword(password))
            System.out.println("The password is strong.");
        else
            System.out.println("The password is not strong.");
    }
}
