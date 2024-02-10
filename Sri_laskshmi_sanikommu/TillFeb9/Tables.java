import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter till what number table: ");

        int n = input.nextInt();
        input.close();

        int total = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(i+" Table");
            for(int j = 1;j <= 10;j++){
                total = i*j;
                System.out.println((i)+" * "+(j)+" = "+total);
            }
        }
    }
    
}
