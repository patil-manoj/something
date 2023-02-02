import java.util.*;
abstract class shape
{
    double a,b;
    void printarea(){};
}
class rectangle extends shape{
    rectangle(double a,double b)
    {
        this.a = a;
        this.b=b;
    }
    void printarea()
    {
        System.out.println("The area of rectangle is"+a*b);
    }
}
class triangle extends shape{
    triangle(double a,double b)
    {
        this.a = a;
        this.b=b;
    }
    void printarea()
    {
        System.out.println("The area of triangle is"+a*b/2);
    }
}
class circle extends shape{
    circle(double a)
    {
        this.a = a;
    }
    void printarea()
    {
        System.out.println("The area of rectangle is"+a*a*3.14);
    }
}

class shapemain
{
    public static void main(String args[])
    {
        shape s;
        rectangle r = new rectangle(10,20);
        triangle t = new triangle(10,20);
        circle c = new circle(5);
        s = r;
        s.printarea();
        s = t;
        s.printarea();
        s = c;
        s.printarea();

    }
}