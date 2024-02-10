package Vehical;

public abstract class Vehical {
    String vehicalType;
    int ccCapacity;

    public abstract void CC();
}

class VehicalMain{
    public static void main(String[] args) {
        Vehical v;
        Bike b = new Bike();
        v = b;
        v.CC();
        Husqvarna h = new Husqvarna();
        v = h;
        v.CC();
    }
}