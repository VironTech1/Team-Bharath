package Basics;

public class Animalmain {
    public static void main(String[] args) {
        Animal a;

        cat c=new cat();
        a=c;
        a.eat();
        c.eat();
        c.meow();
        dog d = new dog();
        d.bark();
        d.eat();
        d.run();
        goat g=new goat();
        g.eat();
        g.may();
        g.run();

        a=c;
        //a.meow();//we cant call the methods of subclass by using the variables of superclass
        cat c1=(cat)a;//DOWNCASTING
        c1.meow();
        //dog d1=(dog)a;//we cant down cast the object of one subclass to another subclass
        blackcat bc=new blackcat();
        bc.color();
        bc.eat();
        bc.run();


    }
}
