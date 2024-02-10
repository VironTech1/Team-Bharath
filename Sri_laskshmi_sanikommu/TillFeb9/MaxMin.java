import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int min;
        int max;

        Scanner input = new Scanner(System.in);

        System.out.println("give the array size: ");
        int n = input.nextInt();

        int a[] = new int[n];
        for(int x = 0; x < n; x++)
        {
            a[x] = input.nextInt();
        }
        input.close();
        min = a[0];
        for(int b =  0;b < a.length;b++){
            if(a[b] < min){
                min = a[b];
            }
        }
        System.out.println("Minimum Value of the array is: "+min);

        max = a[0];
        for(int b =  0;b < a.length;b++){
            if(a[b] > max){
                max = a[b];
            }
        }
        System.out.println("Maximum Value of the array is: "+max);
    }
    
}
