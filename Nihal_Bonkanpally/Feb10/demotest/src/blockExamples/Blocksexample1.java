package blockExamples;
public class Blocksexample1 //this example covers static blocks
{
    static int d=40;
    int v=50;

    public static void main(String[] args) {
        int c=30;
        System.out.println("static variable d can be access because method is also static:"+d);
        System.out.println(c);//this local variable can be accessed easily
        Subbcls.me1();//as this method is static it can be accessed with the help of classname
        Subbcls s1=new Subbcls();
        s1.me2();//this is instance method this will have the memory in object ,so it is accessed with the help of object
    }
    static{
        System.out.println("This is Static block inside Class---->blockexample1");
        System.out.println(d);//it can access the static variables and instance variable can not be accessed
        Subbcls.me1();
       Subbcls s1=new Subbcls();
        s1.me2();
        System.out.println("===========================================");
    }
}
