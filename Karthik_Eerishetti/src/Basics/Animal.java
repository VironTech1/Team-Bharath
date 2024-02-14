package Basics;

public abstract class Animal {
    void run(){
        System.out.println("it runs on four legs");
    }
    abstract void eat();
}
class cat extends Animal{
    void meow(){
        System.out.println("cat meows");
    }
    void eat()
    {
        System.out.println("i drink milk");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("the dog barks");
    }
    void eat(){
        System.out.println("i am tired of meat ");
    }
}
class goat extends Animal{
    void may(){
        System.out.println("goat may's");
    }
    void eat(){
        System.out.println("it eats grass");
    }
}
class blackcat extends cat{
    void color(){
        System.out.println("its black in color");
    }

}
