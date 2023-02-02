import java.util.*;
class NegativeNumberException extends Exception
{
    String detail;
    NegativeNumberException(String detail)
    {
        this.detail = detail;
    }
    public String toString()
    {
        return ("This is a "+detail+" Number");
    }
}
class NegNum
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        try{
            if(i>0)
            {
                throw new NegativeNumberException("Positive");
            }
        }
        catch(NegativeNumberException e)
        {
            System.out.println(e);
        }
        
    }
}