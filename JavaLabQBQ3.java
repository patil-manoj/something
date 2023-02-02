import java.util.*;
class police
{
    public police()
    {
        System.out.println("Inside police class");
    }   
}
class male extends police{
    public male()
    {
        System.out.println("Inside male class");
    }   
}
class female extends police{
    public female()
    {
        System.out.println("Inside female class");
    }   
}
class Crimebranch extends male{
    public Crimebranch()
    {
        System.out.println("Inside Crimebranch class");
    }   
}
class LawAndOrder extends female{
    public LawAndOrder()
    {
        System.out.println("Inside LawAndOrder class");
    }   
}
 class GovernmentSecurityDepartment
{
    public static void main(String args[])
    {
        police p = new police();
        male m = new male();
        female f = new female();
        Crimebranch c = new Crimebranch();
        LawAndOrder l =new LawAndOrder();
    }
}