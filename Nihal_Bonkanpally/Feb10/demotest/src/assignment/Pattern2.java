package assignment;
import java.util.*;
public class Pattern2
{
    public static void main(String[] args) {
        System.out.println("Enter the value of pattern length");
        Scanner s2=new Scanner(System.in);
        int n=s2.nextInt();
        for(int i=n;i>0;i--){
            for(int j=(0+97);j<(i+97);j++){
                System.out.print((char)j);
            System.out.print(" ");}
            System.out.println();
        }
        System.out.println();
    }
}
