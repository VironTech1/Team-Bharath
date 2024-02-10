import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         boolean b = false;

         System.out.println("Enter the length of array: ");
         int n = input.nextInt();

         int a[] = new int[n];
         System.out.println("enter the values of the array");

         for(int i = 0; i < n; i++)
         {
            a[i] = input.nextInt();
         }
         input.close();
         
         

         for(int x = 0; x<a.length;x++)
         {
            if(a[x]%2 == 0){
                b = true;
                System.out.println("Even numbers found at the Index "+x+": "+a[x]);
            }
         }

         if(!b){
            System.out.println("No even numbers found in the array.");
         }

    }
    
}
