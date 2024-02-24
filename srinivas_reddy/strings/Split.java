package strings;

public class Split {
	    public static void main(String[] args) {
	        String fullName = "John Doe";
	        String[] name = fullName.split("\\s+");
	        if (name.length >= 2) {
	            String firstName = name[0];
	            String lastName = name[name.length - 1];
	            System.out.println("First Name: " + firstName);
	            System.out.println("Last Name: " + lastName);
	        } else {
	            System.out.println("Invalid full name format.");
	        }
	    }

