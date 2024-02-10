package constructorExamples;

import java.util.*;

public class Constructionexample2
{
    Constructionexample2 (int w,Subbcls4 u)
    {
        System.out.println(w);
        System.out.println("This is in constructor that is in the main class:"+u.r);
    }
    public static void main(String[] args)
    {
        System.out.println("Program for Constructor with parameter");
        System.out.println("Enter the int  value into Construction in the main class");
        Scanner se=new Scanner(System.in);
        int y=se.nextInt();
        System.out.println("Enter the String:");
        String w= se.next();
        Subbcls4 c3=new Subbcls4(w);
        c3.m6();
        Constructionexample2 c2=new Constructionexample2(y,c3);

    }

}