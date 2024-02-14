package Basics;

public class Assignment6 {
    public static void main(String[] args) {
        int a=6;
        int b=7;
        System.out.println("Value of a:" +a);
        System.out.println(b);
        int temp=b;
        b=a;
        a=temp;
        System.out.println("After swapping"+a);
        System.out.println(b);

    }
}
