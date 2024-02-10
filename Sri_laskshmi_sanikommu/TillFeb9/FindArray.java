import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {

        int[] a = {22,24,31,12,9,18};
        boolean b = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to find: ");

        int x = input.nextInt();
        int i;

        for(i=0; i<7; i++)
        {
            if( x == a[i]){
                b = true;
                break;
            }
            input.close();
        }
        if(b == true){
            System.out.println("Value found at Index: "+i);
        }
        else{
            System.out.println("Value not found");
        }
    }
    
}

