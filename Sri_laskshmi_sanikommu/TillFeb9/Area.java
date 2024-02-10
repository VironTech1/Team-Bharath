public class Area {
    public static void main(String[] args) {

//Rectangle
        int length = 10;
        int width = 20;

        int area = length* width;
        int perimeter = 2*(length+width);
        System.out.println("Area of rectangle is: "+area);
        System.out.println("Perimeter of rectangle is: "+perimeter);


//Square
        int len = 10;

        int a = len*len;
        int p = 4*len;
        System.out.println("Area of Square is: "+a);
        System.out.println("Perimeter of Square is: "+p);

//circle
        int radius = 8;
        double pie = 3.1444;

        double A = pie * (radius*radius);
        double P = 2 * pie * radius;

        System.out.println("Area of Circle is: "+A);
        System.out.println("Perimeter of circle is: "+P);

    }
    
}
