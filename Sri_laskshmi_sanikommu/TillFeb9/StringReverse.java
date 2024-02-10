import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENter a string: ");
        String s = input.nextLine();
        String copy = s;
        String a = "";
        for(int i = copy.length()-1;i>=0;i--){
            a = a+copy.charAt(i);
        }
        System.out.println(a);
        if(s.equalsIgnoreCase(a)){
            System.out.println("Is a palandrome");
        }
        else{
            System.out.println("Not a palandrome");
        }

        // Find substring
        System.out.print("Enter a string to find: ");
        String f = input.nextLine();
        boolean find = s.contains(f);

        if(find){
            System.out.println("String found");
        }
        else{
            System.out.println("String not found");
        }

        //Charecter at specific index

        System.out.print("Enter the index to find the charecter at the index: ");
        int num = input.nextInt();
        char c = s.charAt(num);
        System.out.println("Char at index "+num+" is: "+c);

        String[] nameParts = s.split(" ");
        String firstname = nameParts[0];
        String lastname = nameParts[1];

        System.out.println("First Name: "+firstname);
        System.out.println("Last Name: "+lastname);
    }

}
