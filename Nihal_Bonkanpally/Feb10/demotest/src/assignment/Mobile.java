package assignment;

import assignment.MobileRam;

public class Mobile
{
    int b1;
    String si1;
    double sc1;
    MobileRam ram1;
    Mobile(String si, int b, double sc, MobileRam ram2)
    {
        b1=b;
        si1=si;
        sc1=sc;
        ram1=ram2;
    }
    void m5(){
        System.out.println(b1);
        System.out.println(si1);
        System.out.println(sc1);
        System.out.println(ram1.a);
    }
}
