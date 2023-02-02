import java.util.*;
class noarg extends Exception
{
    String detail;
    noarg(String detail)
    {
        this.detail = detail;
    }
    public String toString()
    {
        return ("NoArgumentsPassed"+detail);
    }
}
class NegativeMarksException extends Exception
{
    public String toString()
    {
        return ("Marks cannot be negative");
    }
}

class Student
{
    public static void main(String args[])
    {   int a;
        String USN,name;
        int marks[] = new int[3];
        a = args.length;
        try{
            if(a==0)
        {
            throw new noarg("NoArgumentPassed");
        }
    }
    catch(noarg e)
    {
        System.out.println(e);
    }
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your USN");
    // USN = sc.next();
    // System.out.println("Enter your name");
    // name = sc.next();
    // for(int i = 0;i<3;i++)
    // {
    //     System.out.println("Enter marks of Subject " + i);
    //     marks[i] = sc.nextInt();
    //     try{
    //         if(marks[i]<0)
    //     {
    //         throw new NegativeMarksException();
    //     }
    //     }
    //     catch(NegativeMarksException e)
    //     {
    //         System.out.println(e);
    //     }
        

    // }
    USN = args[0];
    name = args[1];
    marks[0] = Integer.parseInt(args[2]);
    marks[1] = Integer.parseInt(args[3]);
    marks[2] = Integer.parseInt(args[4]);
    for(int i = 0;i<3;i++)
    {
        try{
                if(marks[i]<0)
                {
                    throw new NegativeMarksException();
                }
                }
                catch(NegativeMarksException e)
                {
                    System.out.println(e);
                }              
        
            }
    }
    
}