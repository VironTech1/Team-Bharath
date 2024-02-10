import java.util.Scanner;

public class Rverese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int n = input.nextInt();
        input.close();
        int reverse = 0;
        int j = n;
        while (j != 0) {
            int i = j%10;
            reverse = reverse*10+i;
            j = j/10;
        }
        System.out.println("Reverse of given number is: "+reverse);

        if(reverse == n){
            System.out.println("Given Number is a Palandrome");
        }
        else{
            System.out.println("Given Number is not palandrome");
        }
    }
    
}
