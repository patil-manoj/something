import java.util.*;
abstract class AreaandVolume{
    double pi = 3.14;
    double r,h;
    void area(){};
    void volume(){};
}
class cylinder extends AreaandVolume
{   double area,volume;
    cylinder(double r,double h)
    {
        this.r = r;
        this.h =h;
    }
    void area()
    {
        area = 2*pi*r*r + 2*pi*r*h;
        System.out.println("The area of cylinder is"+area);
    }
    void volume()
    {
        volume = pi*r*r*h;
        System.out.println("The volume of cylinder is"+volume);
    }
}

class cone extends AreaandVolume
{   double area,volume;
    cone(double r,double h)
    {
        this.r = r;
        this.h =h;
    }
    void area()
    {
        area = pi*r*h + pi*r*r;
        System.out.println("The area of cone is"+area);
    }
    void volume()
    {
        volume = pi*r*r*(Math.sqrt(h*h-r*r))/3;
        System.out.println("The volume of cone is"+volume);
    }
}
class sphere extends AreaandVolume
{   double area,volume;
    sphere(double r)
    {
        this.r = r;
    }
    void area()
    {
        area = 4*pi*r*r ;
        System.out.println("The area of sphere is"+area);
    }
    void volume()
    {
        volume = 4*pi*r*r*r/3;
        System.out.println("The volume of sphere is"+volume);
    }
}
class AreaMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double r1,h,s,r2,r3;
        System.out.println("Enter radius of the cylinder");
        r1 = sc.nextDouble();
        System.out.println("Enter height of the cylinder");
        h = sc.nextDouble();
        System.out.println("Enter radius of the cone");
        r2 = sc.nextDouble();
        System.out.println("Enter slant height of the cone");
        s = sc.nextDouble();
        System.out.println("Enter radius of the sphere");
        r3 = sc.nextDouble();
        AreaandVolume av;
        cylinder c = new cylinder(r1,h);
        cone co = new cone(r2,s);
        sphere sph = new sphere(r3);
        av = c;
        av.area();
        av.volume();
        av = co;
        av.area();
        av.volume();
        av = sph;
        av.area();
        av.volume();
    }
}
